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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceXefbf92fc.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceXefbf92fc(
  public val canceled: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledXfe885025? = null,
  public val duplicate: InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateX3ca2e5f2? = null,
  public val fraudulent: InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentXaf1a492b? = null,
  public val merchandiseNotAsDescribed:
      InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedXc0751726? = null,
  public val noValidAuthorization:
      InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationXf450ced2? = null,
  public val notReceived:
      InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX1fdb963c? = null,
  public val other: InlineV1IssuingDisputesPostRequestFormEvidenceOtherXb88e74db? = null,
  public val reason: InlineV1IssuingDisputesPostRequestFormEvidenceReasonX5d7580d5? = null,
  public val serviceNotAsDescribed:
      InlineV1IssuingDisputesPostRequestFormEvidenceServiceNotAsDescribedXcc152e63? = null,
) {
  public class Builder {
    public var canceled: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledXfe885025? = null

    public var duplicate: InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateX3ca2e5f2? = null

    public var fraudulent: InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentXaf1a492b? = null

    public var merchandiseNotAsDescribed:
        InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedXc0751726? = null

    public var noValidAuthorization:
        InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationXf450ced2? = null

    public var notReceived: InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX1fdb963c? =
        null

    public var other: InlineV1IssuingDisputesPostRequestFormEvidenceOtherXb88e74db? = null

    public var reason: InlineV1IssuingDisputesPostRequestFormEvidenceReasonX5d7580d5? = null

    public var serviceNotAsDescribed:
        InlineV1IssuingDisputesPostRequestFormEvidenceServiceNotAsDescribedXcc152e63? = null

    public fun build(): InlineV1IssuingDisputesPostRequestFormEvidenceXefbf92fc = InlineV1IssuingDisputesPostRequestFormEvidenceXefbf92fc(
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
    public fun build(block: Builder.() -> Unit): InlineV1IssuingDisputesPostRequestFormEvidenceXefbf92fc = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceXefbf92fc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceXefbf92fc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceXefbf92fc")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingDisputesPostRequestFormEvidenceXefbf92fc must be a JSON object")
      return InlineV1IssuingDisputesPostRequestFormEvidenceXefbf92fc(
        canceled = rawObject["canceled"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledXfe885025>(it) },
        duplicate = rawObject["duplicate"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateX3ca2e5f2>(it) },
        fraudulent = rawObject["fraudulent"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentXaf1a492b>(it) },
        merchandiseNotAsDescribed = rawObject["merchandise_not_as_described"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceMerchandiseNotAsDescribedXc0751726>(it) },
        noValidAuthorization = rawObject["no_valid_authorization"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceNoValidAuthorizationXf450ced2>(it) },
        notReceived = rawObject["not_received"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX1fdb963c>(it) },
        other = rawObject["other"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceOtherXb88e74db>(it) },
        reason = rawObject["reason"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceReasonX5d7580d5>(it) },
        serviceNotAsDescribed = rawObject["service_not_as_described"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceServiceNotAsDescribedXcc152e63>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceXefbf92fc) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceXefbf92fc")
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

public fun inlineV1IssuingDisputesPostRequestFormEvidenceXefbf92fc(block: InlineV1IssuingDisputesPostRequestFormEvidenceXefbf92fc.Builder.() -> Unit): InlineV1IssuingDisputesPostRequestFormEvidenceXefbf92fc = InlineV1IssuingDisputesPostRequestFormEvidenceXefbf92fc.build(block)
