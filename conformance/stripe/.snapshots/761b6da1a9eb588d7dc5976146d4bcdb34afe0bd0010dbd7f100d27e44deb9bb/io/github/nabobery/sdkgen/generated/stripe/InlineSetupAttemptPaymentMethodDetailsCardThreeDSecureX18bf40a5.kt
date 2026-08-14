package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineSetupAttemptPaymentMethodDetailsCardThreeDSecureX18bf40a5Branch {
  ThreeDSecureDetails,
}

public sealed class InlineSetupAttemptPaymentMethodDetailsCardThreeDSecureX18bf40a5DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSetupAttemptPaymentMethodDetailsCardThreeDSecureX18bf40a5NoMatchException(
  message: String,
) : InlineSetupAttemptPaymentMethodDetailsCardThreeDSecureX18bf40a5DecodingException(message)

internal data class InlineSetupAttemptPaymentMethodDetailsCardThreeDSecureX18bf40a5Inspection(
  public val matchesThreeDSecureDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesThreeDSecureDetails).count { it }
}

/**
 * Populated if this authorization used 3D Secure authentication.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/setup_attempt_payment_method_details_card/properties/three_d_secure
 */
@Serializable(with = InlineSetupAttemptPaymentMethodDetailsCardThreeDSecureX18bf40a5.Serializer::class)
public class InlineSetupAttemptPaymentMethodDetailsCardThreeDSecureX18bf40a5 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSetupAttemptPaymentMethodDetailsCardThreeDSecureX18bf40a5Inspection,
) {
  public val threeDSecureDetails: ThreeDSecureDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesThreeDSecureDetails) json.decodeFromJsonElement<ThreeDSecureDetailsView>(raw) else null }

  public val matchedBranches:
      Set<InlineSetupAttemptPaymentMethodDetailsCardThreeDSecureX18bf40a5Branch>
    get() = buildSet {
      if (inspection.matchesThreeDSecureDetails) add(InlineSetupAttemptPaymentMethodDetailsCardThreeDSecureX18bf40a5Branch.ThreeDSecureDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSetupAttemptPaymentMethodDetailsCardThreeDSecureX18bf40a5 {
      val inspection = inspectInlineSetupAttemptPaymentMethodDetailsCardThreeDSecureX18bf40a5(raw)
      if (inspection.matchCount == 0) {
        throw InlineSetupAttemptPaymentMethodDetailsCardThreeDSecureX18bf40a5NoMatchException("InlineSetupAttemptPaymentMethodDetailsCardThreeDSecureX18bf40a5 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSetupAttemptPaymentMethodDetailsCardThreeDSecureX18bf40a5(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSetupAttemptPaymentMethodDetailsCardThreeDSecureX18bf40a5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSetupAttemptPaymentMethodDetailsCardThreeDSecureX18bf40a5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSetupAttemptPaymentMethodDetailsCardThreeDSecureX18bf40a5")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSetupAttemptPaymentMethodDetailsCardThreeDSecureX18bf40a5) {
      encoder.requireJsonEncoder("InlineSetupAttemptPaymentMethodDetailsCardThreeDSecureX18bf40a5").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSetupAttemptPaymentMethodDetailsCardThreeDSecureX18bf40a5(element: JsonElement): InlineSetupAttemptPaymentMethodDetailsCardThreeDSecureX18bf40a5Inspection {
  val raw = element as? JsonObject ?: return InlineSetupAttemptPaymentMethodDetailsCardThreeDSecureX18bf40a5Inspection(
    matchesThreeDSecureDetails = false,
    failures = listOf("ThreeDSecureDetails: expected JSON object"),
  )
  val matchesThreeDSecureDetails = true
  return InlineSetupAttemptPaymentMethodDetailsCardThreeDSecureX18bf40a5Inspection(
    matchesThreeDSecureDetails = matchesThreeDSecureDetails,
    failures = buildList {
      if (!matchesThreeDSecureDetails) add("ThreeDSecureDetails: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
