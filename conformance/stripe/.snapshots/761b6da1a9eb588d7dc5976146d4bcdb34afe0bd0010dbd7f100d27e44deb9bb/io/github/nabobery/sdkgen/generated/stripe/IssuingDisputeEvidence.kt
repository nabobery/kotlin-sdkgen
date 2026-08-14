package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_dispute_evidence
 */
@Serializable(with = IssuingDisputeEvidence.Serializer::class)
public class IssuingDisputeEvidence(
  /**
   * The reason for filing the dispute. Its value will match the field containing the evidence.
   */
  public val reason: InlineIssuingDisputeEvidenceReasonXa0313758,
  public val canceled: IssuingDisputeCanceledEvidence? = null,
  public val duplicate: IssuingDisputeDuplicateEvidence? = null,
  public val fraudulent: IssuingDisputeFraudulentEvidence? = null,
  public val merchandiseNotAsDescribed: IssuingDisputeMerchandiseNotAsDescribedEvidence? = null,
  public val noValidAuthorization: IssuingDisputeNoValidAuthorizationEvidence? = null,
  public val notReceived: IssuingDisputeNotReceivedEvidence? = null,
  public val other: IssuingDisputeOtherEvidence? = null,
  public val serviceNotAsDescribed: IssuingDisputeServiceNotAsDescribedEvidence? = null,
) {
  public class Builder {
    private var reasonValue: InlineIssuingDisputeEvidenceReasonXa0313758? = null

    public var reason: InlineIssuingDisputeEvidenceReasonXa0313758
      get() = requireNotNull(reasonValue) { "reason is required" }
      set(`value`) {
        reasonValue = value
      }

    public var canceled: IssuingDisputeCanceledEvidence? = null

    public var duplicate: IssuingDisputeDuplicateEvidence? = null

    public var fraudulent: IssuingDisputeFraudulentEvidence? = null

    public var merchandiseNotAsDescribed: IssuingDisputeMerchandiseNotAsDescribedEvidence? = null

    public var noValidAuthorization: IssuingDisputeNoValidAuthorizationEvidence? = null

    public var notReceived: IssuingDisputeNotReceivedEvidence? = null

    public var other: IssuingDisputeOtherEvidence? = null

    public var serviceNotAsDescribed: IssuingDisputeServiceNotAsDescribedEvidence? = null

    public fun build(): IssuingDisputeEvidence {
      check(reasonValue != null) { "reason is required" }
      return IssuingDisputeEvidence(
        reason = reason,
        canceled = canceled,
        duplicate = duplicate,
        fraudulent = fraudulent,
        merchandiseNotAsDescribed = merchandiseNotAsDescribed,
        noValidAuthorization = noValidAuthorization,
        notReceived = notReceived,
        other = other,
        serviceNotAsDescribed = serviceNotAsDescribed,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingDisputeEvidence = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<IssuingDisputeEvidence> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingDisputeEvidence {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingDisputeEvidence")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingDisputeEvidence must be a JSON object")
      val reason = json.decodeRequired<InlineIssuingDisputeEvidenceReasonXa0313758>(rawObject, "reason")
      return IssuingDisputeEvidence(
        reason = reason,
        canceled = rawObject["canceled"]?.let { json.decodeFromJsonElement<IssuingDisputeCanceledEvidence>(it) },
        duplicate = rawObject["duplicate"]?.let { json.decodeFromJsonElement<IssuingDisputeDuplicateEvidence>(it) },
        fraudulent = rawObject["fraudulent"]?.let { json.decodeFromJsonElement<IssuingDisputeFraudulentEvidence>(it) },
        merchandiseNotAsDescribed = rawObject["merchandise_not_as_described"]?.let { json.decodeFromJsonElement<IssuingDisputeMerchandiseNotAsDescribedEvidence>(it) },
        noValidAuthorization = rawObject["no_valid_authorization"]?.let { json.decodeFromJsonElement<IssuingDisputeNoValidAuthorizationEvidence>(it) },
        notReceived = rawObject["not_received"]?.let { json.decodeFromJsonElement<IssuingDisputeNotReceivedEvidence>(it) },
        other = rawObject["other"]?.let { json.decodeFromJsonElement<IssuingDisputeOtherEvidence>(it) },
        serviceNotAsDescribed = rawObject["service_not_as_described"]?.let { json.decodeFromJsonElement<IssuingDisputeServiceNotAsDescribedEvidence>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingDisputeEvidence) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingDisputeEvidence")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("reason", json.encodeToJsonElement(value.reason))
        value.canceled?.let { put("canceled", json.encodeToJsonElement(it)) }
        value.duplicate?.let { put("duplicate", json.encodeToJsonElement(it)) }
        value.fraudulent?.let { put("fraudulent", json.encodeToJsonElement(it)) }
        value.merchandiseNotAsDescribed?.let { put("merchandise_not_as_described", json.encodeToJsonElement(it)) }
        value.noValidAuthorization?.let { put("no_valid_authorization", json.encodeToJsonElement(it)) }
        value.notReceived?.let { put("not_received", json.encodeToJsonElement(it)) }
        value.other?.let { put("other", json.encodeToJsonElement(it)) }
        value.serviceNotAsDescribed?.let { put("service_not_as_described", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingDisputeEvidence(block: IssuingDisputeEvidence.Builder.() -> Unit): IssuingDisputeEvidence = IssuingDisputeEvidence.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("IssuingDisputeEvidence is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
