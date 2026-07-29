package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class IssuingAuthorizationNetworkDataView(
  @SerialName("acquiring_institution_id")
  public val acquiringInstitutionId: String? = null,
  @SerialName("system_trace_audit_number")
  public val systemTraceAuditNumber: String? = null,
  @SerialName("transaction_id")
  public val transactionId: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_authorization_network_data
 */
@Serializable(with = IssuingAuthorizationNetworkData.Serializer::class)
public class IssuingAuthorizationNetworkData(
  /**
   * Identifier assigned to the acquirer by the card network. Sometimes this value is not provided by the network; in
   * this case, the value will be `null`.
   */
  public val acquiringInstitutionId: String? = null,
  /**
   * The System Trace Audit Number (STAN) is a 6-digit identifier assigned by the acquirer. Prefer
   * `network_data.transaction_id` if present, unless you have special requirements.
   */
  public val systemTraceAuditNumber: String? = null,
  /**
   * Unique identifier for the authorization assigned by the card network used to match subsequent messages, disputes,
   * and transactions.
   */
  public val transactionId: String? = null,
) {
  public class Builder {
    /**
     * Identifier assigned to the acquirer by the card network. Sometimes this value is not provided by the network; in
     * this case, the value will be `null`.
     */
    public var acquiringInstitutionId: String? = null

    /**
     * The System Trace Audit Number (STAN) is a 6-digit identifier assigned by the acquirer. Prefer
     * `network_data.transaction_id` if present, unless you have special requirements.
     */
    public var systemTraceAuditNumber: String? = null

    /**
     * Unique identifier for the authorization assigned by the card network used to match subsequent messages, disputes,
     * and transactions.
     */
    public var transactionId: String? = null

    public fun build(): IssuingAuthorizationNetworkData = IssuingAuthorizationNetworkData(
      acquiringInstitutionId = acquiringInstitutionId,
      systemTraceAuditNumber = systemTraceAuditNumber,
      transactionId = transactionId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingAuthorizationNetworkData = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<IssuingAuthorizationNetworkData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingAuthorizationNetworkData {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingAuthorizationNetworkData")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingAuthorizationNetworkData must be a JSON object")
      return IssuingAuthorizationNetworkData(
        acquiringInstitutionId = rawObject["acquiring_institution_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        systemTraceAuditNumber = rawObject["system_trace_audit_number"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        transactionId = rawObject["transaction_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingAuthorizationNetworkData) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingAuthorizationNetworkData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.acquiringInstitutionId?.let { put("acquiring_institution_id", it) }
        value.systemTraceAuditNumber?.let { put("system_trace_audit_number", it) }
        value.transactionId?.let { put("transaction_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingAuthorizationNetworkData(block: IssuingAuthorizationNetworkData.Builder.() -> Unit): IssuingAuthorizationNetworkData = IssuingAuthorizationNetworkData.build(block)
