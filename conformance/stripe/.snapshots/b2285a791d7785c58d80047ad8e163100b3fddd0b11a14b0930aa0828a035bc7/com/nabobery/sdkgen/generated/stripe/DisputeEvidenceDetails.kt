package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/dispute_evidence_details
 */
@Serializable(with = DisputeEvidenceDetails.Serializer::class)
public class DisputeEvidenceDetails(
  public val enhancedEligibility: DisputeEnhancedEligibility,
  /**
   * Whether evidence has been staged for this dispute.
   */
  public val hasEvidence: Boolean,
  /**
   * Whether the last evidence submission was submitted past the due date. Defaults to `false` if no evidence
   * submissions have occurred. If `true`, then delivery of the latest evidence is *not* guaranteed.
   */
  public val pastDue: Boolean,
  /**
   * The number of times evidence has been submitted. Typically, you may only submit evidence once.
   */
  public val submissionCount: Int,
  /**
   * Date by which evidence must be submitted in order to successfully challenge dispute. Will be 0 if the customer's
   * bank or credit card company doesn't allow a response for this particular dispute.
   */
  public val dueBy: Int? = null,
) {
  public class Builder {
    private var enhancedEligibilityValue: DisputeEnhancedEligibility? = null

    public var enhancedEligibility: DisputeEnhancedEligibility
      get() = requireNotNull(enhancedEligibilityValue) { "enhancedEligibility is required" }
      set(`value`) {
        enhancedEligibilityValue = value
      }

    private var hasEvidenceValue: Boolean? = null

    public var hasEvidence: Boolean
      get() = requireNotNull(hasEvidenceValue) { "hasEvidence is required" }
      set(`value`) {
        hasEvidenceValue = value
      }

    private var pastDueValue: Boolean? = null

    public var pastDue: Boolean
      get() = requireNotNull(pastDueValue) { "pastDue is required" }
      set(`value`) {
        pastDueValue = value
      }

    private var submissionCountValue: Int? = null

    public var submissionCount: Int
      get() = requireNotNull(submissionCountValue) { "submissionCount is required" }
      set(`value`) {
        submissionCountValue = value
      }

    /**
     * Date by which evidence must be submitted in order to successfully challenge dispute. Will be 0 if the customer's
     * bank or credit card company doesn't allow a response for this particular dispute.
     */
    public var dueBy: Int? = null

    public fun build(): DisputeEvidenceDetails {
      check(enhancedEligibilityValue != null) { "enhancedEligibility is required" }
      check(hasEvidenceValue != null) { "hasEvidence is required" }
      check(pastDueValue != null) { "pastDue is required" }
      check(submissionCountValue != null) { "submissionCount is required" }
      return DisputeEvidenceDetails(
        enhancedEligibility = enhancedEligibility,
        hasEvidence = hasEvidence,
        pastDue = pastDue,
        submissionCount = submissionCount,
        dueBy = dueBy,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DisputeEvidenceDetails = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<DisputeEvidenceDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DisputeEvidenceDetails {
      val jsonDecoder = decoder.requireJsonDecoder("DisputeEvidenceDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DisputeEvidenceDetails must be a JSON object")
      val enhancedEligibility = json.decodeRequired<DisputeEnhancedEligibility>(rawObject, "enhanced_eligibility")
      val hasEvidence = json.decodeRequired<Boolean>(rawObject, "has_evidence")
      val pastDue = json.decodeRequired<Boolean>(rawObject, "past_due")
      val submissionCount = json.decodeRequired<Int>(rawObject, "submission_count")
      return DisputeEvidenceDetails(
        enhancedEligibility = enhancedEligibility,
        hasEvidence = hasEvidence,
        pastDue = pastDue,
        submissionCount = submissionCount,
        dueBy = rawObject["due_by"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: DisputeEvidenceDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("DisputeEvidenceDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enhanced_eligibility", json.encodeToJsonElement(value.enhancedEligibility))
        put("has_evidence", json.encodeToJsonElement(value.hasEvidence))
        put("past_due", json.encodeToJsonElement(value.pastDue))
        put("submission_count", json.encodeToJsonElement(value.submissionCount))
        value.dueBy?.let { put("due_by", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun disputeEvidenceDetails(block: DisputeEvidenceDetails.Builder.() -> Unit): DisputeEvidenceDetails = DisputeEvidenceDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("DisputeEvidenceDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
