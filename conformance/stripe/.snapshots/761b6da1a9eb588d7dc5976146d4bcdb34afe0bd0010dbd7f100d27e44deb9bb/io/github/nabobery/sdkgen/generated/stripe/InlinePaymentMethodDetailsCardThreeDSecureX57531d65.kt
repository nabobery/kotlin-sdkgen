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

public enum class InlinePaymentMethodDetailsCardThreeDSecureX57531d65Branch {
  ThreeDSecureDetailsCharge,
}

public sealed class InlinePaymentMethodDetailsCardThreeDSecureX57531d65DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentMethodDetailsCardThreeDSecureX57531d65NoMatchException(
  message: String,
) : InlinePaymentMethodDetailsCardThreeDSecureX57531d65DecodingException(message)

internal data class InlinePaymentMethodDetailsCardThreeDSecureX57531d65Inspection(
  public val matchesThreeDSecureDetailsCharge: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesThreeDSecureDetailsCharge).count { it }
}

/**
 * Populated if this transaction used 3D Secure authentication.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_card/properties/three_d_secure
 */
@Serializable(with = InlinePaymentMethodDetailsCardThreeDSecureX57531d65.Serializer::class)
public class InlinePaymentMethodDetailsCardThreeDSecureX57531d65 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentMethodDetailsCardThreeDSecureX57531d65Inspection,
) {
  public val threeDSecureDetailsCharge: ThreeDSecureDetailsChargeView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesThreeDSecureDetailsCharge) json.decodeFromJsonElement<ThreeDSecureDetailsChargeView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentMethodDetailsCardThreeDSecureX57531d65Branch>
    get() = buildSet {
      if (inspection.matchesThreeDSecureDetailsCharge) add(InlinePaymentMethodDetailsCardThreeDSecureX57531d65Branch.ThreeDSecureDetailsCharge)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentMethodDetailsCardThreeDSecureX57531d65 {
      val inspection = inspectInlinePaymentMethodDetailsCardThreeDSecureX57531d65(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentMethodDetailsCardThreeDSecureX57531d65NoMatchException("InlinePaymentMethodDetailsCardThreeDSecureX57531d65 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentMethodDetailsCardThreeDSecureX57531d65(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodDetailsCardThreeDSecureX57531d65> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsCardThreeDSecureX57531d65 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodDetailsCardThreeDSecureX57531d65")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodDetailsCardThreeDSecureX57531d65) {
      encoder.requireJsonEncoder("InlinePaymentMethodDetailsCardThreeDSecureX57531d65").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentMethodDetailsCardThreeDSecureX57531d65(element: JsonElement): InlinePaymentMethodDetailsCardThreeDSecureX57531d65Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentMethodDetailsCardThreeDSecureX57531d65Inspection(
    matchesThreeDSecureDetailsCharge = false,
    failures = listOf("ThreeDSecureDetailsCharge: expected JSON object"),
  )
  val matchesThreeDSecureDetailsCharge = true
  return InlinePaymentMethodDetailsCardThreeDSecureX57531d65Inspection(
    matchesThreeDSecureDetailsCharge = matchesThreeDSecureDetailsCharge,
    failures = buildList {
      if (!matchesThreeDSecureDetailsCharge) add("ThreeDSecureDetailsCharge: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
