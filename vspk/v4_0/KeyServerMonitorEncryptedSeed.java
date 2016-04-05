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


package vspk.v4_0;

import bambou.RestObject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

import vspk.v4_0.fetchers.GlobalMetadatasFetcher;
import vspk.v4_0.fetchers.MetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class KeyServerMonitorEncryptedSeed extends RestObject {

   public final static String REST_NAME = "keyservermonitorencryptedseed";
   public final static String RESOURCE_NAME = "keyservermonitorencryptedseeds";

   
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "SEKCreationTime")
   protected int SEKCreationTime;
   
   @JsonProperty(value = "associatedKeyServerMonitorSEKCreationTime")
   protected int associatedKeyServerMonitorSEKCreationTime;
   
   @JsonProperty(value = "associatedKeyServerMonitorSEKID")
   protected String associatedKeyServerMonitorSEKID;
   
   @JsonProperty(value = "associatedKeyServerMonitorSeedCreationTime")
   protected int associatedKeyServerMonitorSeedCreationTime;
   
   @JsonProperty(value = "associatedKeyServerMonitorSeedID")
   protected String associatedKeyServerMonitorSeedID;
   
   @JsonProperty(value = "enterpriseSecuredDataID")
   protected String enterpriseSecuredDataID;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "keyServerCertificateSerialNumber")
   protected int keyServerCertificateSerialNumber;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public KeyServerMonitorEncryptedSeed() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   public int getSEKCreationTime() {
      return SEKCreationTime;
   }

   public void setSEKCreationTime(int value) { 
      this.SEKCreationTime = value;
   }
   public int getAssociatedKeyServerMonitorSEKCreationTime() {
      return associatedKeyServerMonitorSEKCreationTime;
   }

   public void setAssociatedKeyServerMonitorSEKCreationTime(int value) { 
      this.associatedKeyServerMonitorSEKCreationTime = value;
   }
   public String getAssociatedKeyServerMonitorSEKID() {
      return associatedKeyServerMonitorSEKID;
   }

   public void setAssociatedKeyServerMonitorSEKID(String value) { 
      this.associatedKeyServerMonitorSEKID = value;
   }
   public int getAssociatedKeyServerMonitorSeedCreationTime() {
      return associatedKeyServerMonitorSeedCreationTime;
   }

   public void setAssociatedKeyServerMonitorSeedCreationTime(int value) { 
      this.associatedKeyServerMonitorSeedCreationTime = value;
   }
   public String getAssociatedKeyServerMonitorSeedID() {
      return associatedKeyServerMonitorSeedID;
   }

   public void setAssociatedKeyServerMonitorSeedID(String value) { 
      this.associatedKeyServerMonitorSeedID = value;
   }
   public String getEnterpriseSecuredDataID() {
      return enterpriseSecuredDataID;
   }

   public void setEnterpriseSecuredDataID(String value) { 
      this.enterpriseSecuredDataID = value;
   }
   public EntityScope getEntityScope() {
      return entityScope;
   }

   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   public String getExternalID() {
      return externalID;
   }

   public void setExternalID(String value) { 
      this.externalID = value;
   }
   public int getKeyServerCertificateSerialNumber() {
      return keyServerCertificateSerialNumber;
   }

   public void setKeyServerCertificateSerialNumber(int value) { 
      this.keyServerCertificateSerialNumber = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   

   
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   

   public String toString() {
      return "KeyServerMonitorEncryptedSeed [" + "SEKCreationTime=" + SEKCreationTime + ", associatedKeyServerMonitorSEKCreationTime=" + associatedKeyServerMonitorSEKCreationTime + ", associatedKeyServerMonitorSEKID=" + associatedKeyServerMonitorSEKID + ", associatedKeyServerMonitorSeedCreationTime=" + associatedKeyServerMonitorSeedCreationTime + ", associatedKeyServerMonitorSeedID=" + associatedKeyServerMonitorSeedID + ", enterpriseSecuredDataID=" + enterpriseSecuredDataID + ", entityScope=" + entityScope + ", externalID=" + externalID + ", keyServerCertificateSerialNumber=" + keyServerCertificateSerialNumber + ", lastUpdatedBy=" + lastUpdatedBy + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}