package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Evidence provided for the dispute.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceXc37b39e9.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceXc37b39e9(
  public val canceled: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledX27bb5887? = null,
  public val duplicate: InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateXbc729c8f? = null,
  public val fraudulent: InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentX22d1210f? = null,
  public val merchandiseNotAsDescribed:
      InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedX24e14259? = null,
  public val noValidAuthorization:
      InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationX7d333ec9? = null,
  public val notReceived:
      InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX67fd19b0? = null,
  public val other: InlineV1IssuingDisputesPostRequestFormEvidenceOtherX627ee1cc? = null,
  public val reason: InlineV1IssuingDisputesPostRequestFormEvidenceReasonX7793221a? = null,
  public val serviceNotAsDescribed:
      InlineV1IssuingDisputesPostRequestFormEvidenceServiceNotAsDescribedXf4c8aae3? = null,
) {
  public class Builder {
    public var canceled: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledX27bb5887? = null

    public var duplicate: InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateXbc729c8f? = null

    public var fraudulent: InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentX22d1210f? = null

    public var merchandiseNotAsDescribed:
        InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedX24e14259? = null

    public var noValidAuthorization:
        InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationX7d333ec9? = null

    public var notReceived: InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX67fd19b0? =
        null

    public var other: InlineV1IssuingDisputesPostRequestFormEvidenceOtherX627ee1cc? = null

    public var reason: InlineV1IssuingDisputesPostRequestFormEvidenceReasonX7793221a? = null

    public var serviceNotAsDescribed:
        InlineV1IssuingDisputesPostRequestFormEvidenceServiceNotAsDescribedXf4c8aae3? = null

    public fun build(): InlineV1IssuingDisputesPostRequestFormEvidenceXc37b39e9 = InlineV1IssuingDisputesPostRequestFormEvidenceXc37b39e9(
      canceled = canceled,
      duplicate = duplicate,
      fraudulent = fraudulent,
      merchandiseNotAsDescribed = merchandiseNotAsDescribed,
      noValidAuthorization = noValidAuthorization,
      notReceived = notReceived,
      other = other,
      reason = reason,
      serviceNotAsDescribed = serviceNotAsDescribed,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingDisputesPostRequestFormEvidenceXc37b39e9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceXc37b39e9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceXc37b39e9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceXc37b39e9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingDisputesPostRequestFormEvidenceXc37b39e9 must be a JSON object")
      return InlineV1IssuingDisputesPostRequestFormEvidenceXc37b39e9(
        canceled = rawObject["canceled"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledX27bb5887>(it) },
        duplicate = rawObject["duplicate"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateXbc729c8f>(it) },
        fraudulent = rawObject["fraudulent"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentX22d1210f>(it) },
        merchandiseNotAsDescribed = rawObject["merchandise_not_as_described"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedX24e14259>(it) },
        noValidAuthorization = rawObject["no_valid_authorization"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationX7d333ec9>(it) },
        notReceived = rawObject["not_received"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX67fd19b0>(it) },
        other = rawObject["other"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceOtherX627ee1cc>(it) },
        reason = rawObject["reason"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceReasonX7793221a>(it) },
        serviceNotAsDescribed = rawObject["service_not_as_described"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceServiceNotAsDescribedXf4c8aae3>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceXc37b39e9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceXc37b39e9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.canceled?.let { put("canceled", json.encodeToJsonElement(it)) }
        value.duplicate?.let { put("duplicate", json.encodeToJsonElement(it)) }
        value.fraudulent?.let { put("fraudulent", json.encodeToJsonElement(it)) }
        value.merchandiseNotAsDescribed?.let { put("merchandise_not_as_described", json.encodeToJsonElement(it)) }
        value.noValidAuthorization?.let { put("no_valid_authorization", json.encodeToJsonElement(it)) }
        value.notReceived?.let { put("not_received", json.encodeToJsonElement(it)) }
        value.other?.let { put("other", json.encodeToJsonElement(it)) }
        value.reason?.let { put("reason", json.encodeToJsonElement(it)) }
        value.serviceNotAsDescribed?.let { put("service_not_as_described", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IssuingDisputesPostRequestFormEvidenceXc37b39e9(block: InlineV1IssuingDisputesPostRequestFormEvidenceXc37b39e9.Builder.() -> Unit): InlineV1IssuingDisputesPostRequestFormEvidenceXc37b39e9 = InlineV1IssuingDisputesPostRequestFormEvidenceXc37b39e9.build(block)
