package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Source: sdkgen://source/openapi.json#/components/schemas/dispute_enhanced_eligibility_visa_compelling_evidence3
 */
@Serializable(with = DisputeEnhancedEligibilityVisaCompellingEvidence3.Serializer::class)
public class DisputeEnhancedEligibilityVisaCompellingEvidence3(
  requiredActions: List<InlineDisputeEnhancedEligi3879RequiredActionsItemX14f7cb8e>,
  /**
   * Visa Compelling Evidence 3.0 eligibility status.
   */
  public val status: InlineDisputeEnhancedEligibilityVisaCompellingEvidence3StatusX17878737,
) {
  /**
   * List of actions required to qualify dispute for Visa Compelling Evidence 3.0 evidence submission.
   */
  public val requiredActions: List<InlineDisputeEnhancedEligi3879RequiredActionsItemX14f7cb8e> =
      requiredActions.toList()

  public class Builder {
    private var requiredActionsValue:
        List<InlineDisputeEnhancedEligi3879RequiredActionsItemX14f7cb8e>? = null

    public var requiredActions: List<InlineDisputeEnhancedEligi3879RequiredActionsItemX14f7cb8e>
      get() = requireNotNull(requiredActionsValue) { "requiredActions is required" }.toList()
      set(`value`) {
        requiredActionsValue = value.toList()
      }

    private var statusValue: InlineDisputeEnhancedEligibilityVisaCompellingEvidence3StatusX17878737?
        = null

    public var status: InlineDisputeEnhancedEligibilityVisaCompellingEvidence3StatusX17878737
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    public fun build(): DisputeEnhancedEligibilityVisaCompellingEvidence3 {
      check(requiredActionsValue != null) { "requiredActions is required" }
      check(statusValue != null) { "status is required" }
      return DisputeEnhancedEligibilityVisaCompellingEvidence3(
        requiredActions = requiredActions,
        status = status,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DisputeEnhancedEligibilityVisaCompellingEvidence3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<DisputeEnhancedEligibilityVisaCompellingEvidence3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DisputeEnhancedEligibilityVisaCompellingEvidence3 {
      val jsonDecoder = decoder.requireJsonDecoder("DisputeEnhancedEligibilityVisaCompellingEvidence3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DisputeEnhancedEligibilityVisaCompellingEvidence3 must be a JSON object")
      val requiredActions = json.decodeRequired<List<InlineDisputeEnhancedEligi3879RequiredActionsItemX14f7cb8e>>(rawObject, "required_actions")
      val status = json.decodeRequired<InlineDisputeEnhancedEligibilityVisaCompellingEvidence3StatusX17878737>(rawObject, "status")
      return DisputeEnhancedEligibilityVisaCompellingEvidence3(
        requiredActions = requiredActions,
        status = status,
      )
    }

    override fun serialize(encoder: Encoder, `value`: DisputeEnhancedEligibilityVisaCompellingEvidence3) {
      val jsonEncoder = encoder.requireJsonEncoder("DisputeEnhancedEligibilityVisaCompellingEvidence3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("required_actions", json.encodeToJsonElement(value.requiredActions))
        put("status", json.encodeToJsonElement(value.status))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun disputeEnhancedEligibilityVisaCompellingEvidence3(block: DisputeEnhancedEligibilityVisaCompellingEvidence3.Builder.() -> Unit): DisputeEnhancedEligibilityVisaCompellingEvidence3 = DisputeEnhancedEligibilityVisaCompellingEvidence3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("DisputeEnhancedEligibilityVisaCompellingEvidence3 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
