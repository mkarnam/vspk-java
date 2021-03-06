/*
  Copyright (c) 2015, Alcatel-Lucent Inc
  All rights reserved.

  Redistribution and use in source and binary forms, with or without
  modification, are permitted provided that the following conditions are met:
      * Redistributions of source code must retain the above copyright
        notice, this list of conditions and the following disclaimer.
      * Redistributions in binary form must reproduce the above copyright
        notice, this list of conditions and the following disclaimer in the
        documentation and/or other materials provided with the distribution.
      * Neither the name of the copyright holder nor the names of its contributors
        may be used to endorse or promote products derived from this software without
        specific prior written permission.

  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
  DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY
  DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
  (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
  LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
  ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
  SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package net.nuagenetworks.vspk.v6;

import net.nuagenetworks.bambou.RestObject;
import net.nuagenetworks.bambou.annotation.RestEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


import net.nuagenetworks.vspk.v6.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "vnfdomainmapping", resourceName = "vnfdomainmappings")
public class VNFDomainMapping extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum ESegmentationType { VLAN };

   
   @JsonProperty(value = "associatedDomainID")
   
   protected String associatedDomainID;
   
   @JsonProperty(value = "associatedDomainName")
   
   protected String associatedDomainName;
   
   @JsonProperty(value = "associatedEnterpriseID")
   
   protected String associatedEnterpriseID;
   
   @JsonProperty(value = "associatedNSGatewayID")
   
   protected String associatedNSGatewayID;
   
   @JsonProperty(value = "associatedNSGatewayName")
   
   protected String associatedNSGatewayName;
   
   @JsonProperty(value = "autoCreated")
   
   protected Boolean autoCreated;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "enterpriseName")
   
   protected String enterpriseName;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "segmentationID")
   
   protected Long segmentationID;
   
   @JsonProperty(value = "segmentationType")
   
   protected ESegmentationType segmentationType;
   
   @JsonProperty(value = "serviceId")
   
   protected String serviceId;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public VNFDomainMapping() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   
   
   @JsonIgnore
   public String getAssociatedDomainID() {
      return associatedDomainID;
   }

   @JsonIgnore
   public void setAssociatedDomainID(String value) { 
      this.associatedDomainID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedDomainName() {
      return associatedDomainName;
   }

   @JsonIgnore
   public void setAssociatedDomainName(String value) { 
      this.associatedDomainName = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedEnterpriseID() {
      return associatedEnterpriseID;
   }

   @JsonIgnore
   public void setAssociatedEnterpriseID(String value) { 
      this.associatedEnterpriseID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedNSGatewayID() {
      return associatedNSGatewayID;
   }

   @JsonIgnore
   public void setAssociatedNSGatewayID(String value) { 
      this.associatedNSGatewayID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedNSGatewayName() {
      return associatedNSGatewayName;
   }

   @JsonIgnore
   public void setAssociatedNSGatewayName(String value) { 
      this.associatedNSGatewayName = value;
   }
   
   
   @JsonIgnore
   public Boolean getAutoCreated() {
      return autoCreated;
   }

   @JsonIgnore
   public void setAutoCreated(Boolean value) { 
      this.autoCreated = value;
   }
   
   
   @JsonIgnore
   public java.util.List<Metadata> getEmbeddedMetadata() {
      return embeddedMetadata;
   }

   @JsonIgnore
   public void setEmbeddedMetadata(java.util.List<Metadata> value) { 
      this.embeddedMetadata = value;
   }
   
   
   @JsonIgnore
   public String getEnterpriseName() {
      return enterpriseName;
   }

   @JsonIgnore
   public void setEnterpriseName(String value) { 
      this.enterpriseName = value;
   }
   
   
   @JsonIgnore
   public EEntityScope getEntityScope() {
      return entityScope;
   }

   @JsonIgnore
   public void setEntityScope(EEntityScope value) { 
      this.entityScope = value;
   }
   
   
   @JsonIgnore
   public String getExternalID() {
      return externalID;
   }

   @JsonIgnore
   public void setExternalID(String value) { 
      this.externalID = value;
   }
   
   
   @JsonIgnore
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   @JsonIgnore
   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   
   
   @JsonIgnore
   public Long getSegmentationID() {
      return segmentationID;
   }

   @JsonIgnore
   public void setSegmentationID(Long value) { 
      this.segmentationID = value;
   }
   
   
   @JsonIgnore
   public ESegmentationType getSegmentationType() {
      return segmentationType;
   }

   @JsonIgnore
   public void setSegmentationType(ESegmentationType value) { 
      this.segmentationType = value;
   }
   
   
   @JsonIgnore
   public String getServiceId() {
      return serviceId;
   }

   @JsonIgnore
   public void setServiceId(String value) { 
      this.serviceId = value;
   }
   

   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   

   public String toString() {
      return "VNFDomainMapping [" + "associatedDomainID=" + associatedDomainID + ", associatedDomainName=" + associatedDomainName + ", associatedEnterpriseID=" + associatedEnterpriseID + ", associatedNSGatewayID=" + associatedNSGatewayID + ", associatedNSGatewayName=" + associatedNSGatewayName + ", autoCreated=" + autoCreated + ", embeddedMetadata=" + embeddedMetadata + ", enterpriseName=" + enterpriseName + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", segmentationID=" + segmentationID + ", segmentationType=" + segmentationType + ", serviceId=" + serviceId + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}