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

public enum class InlinePaymentMethodCardThreeDSecureUsageXbfee3c7fBranch {
  ThreeDSecureUsage,
}

public sealed class InlinePaymentMethodCardThreeDSecureUsageXbfee3c7fDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentMethodCardThreeDSecureUsageXbfee3c7fNoMatchException(
  message: String,
) : InlinePaymentMethodCardThreeDSecureUsageXbfee3c7fDecodingException(message)

internal data class InlinePaymentMethodCardThreeDSecureUsageXbfee3c7fInspection(
  public val matchesThreeDSecureUsage: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesThreeDSecureUsage).count { it }
}

/**
 * Contains details on how this Card may be used for 3D Secure authentication.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_card/properties/three_d_secure_usage
 */
@Serializable(with = InlinePaymentMethodCardThreeDSecureUsageXbfee3c7f.Serializer::class)
public class InlinePaymentMethodCardThreeDSecureUsageXbfee3c7f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentMethodCardThreeDSecureUsageXbfee3c7fInspection,
) {
  public val threeDSecureUsage: ThreeDSecureUsageView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesThreeDSecureUsage) json.decodeFromJsonElement<ThreeDSecureUsageView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentMethodCardThreeDSecureUsageXbfee3c7fBranch>
    get() = buildSet {
      if (inspection.matchesThreeDSecureUsage) add(InlinePaymentMethodCardThreeDSecureUsageXbfee3c7fBranch.ThreeDSecureUsage)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentMethodCardThreeDSecureUsageXbfee3c7f {
      val inspection = inspectInlinePaymentMethodCardThreeDSecureUsageXbfee3c7f(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentMethodCardThreeDSecureUsageXbfee3c7fNoMatchException("InlinePaymentMethodCardThreeDSecureUsageXbfee3c7f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentMethodCardThreeDSecureUsageXbfee3c7f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodCardThreeDSecureUsageXbfee3c7f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentMethodCardThreeDSecureUsageXbfee3c7f {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodCardThreeDSecureUsageXbfee3c7f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodCardThreeDSecureUsageXbfee3c7f) {
      encoder.requireJsonEncoder("InlinePaymentMethodCardThreeDSecureUsageXbfee3c7f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentMethodCardThreeDSecureUsageXbfee3c7f(element: JsonElement): InlinePaymentMethodCardThreeDSecureUsageXbfee3c7fInspection {
  val raw = element as? JsonObject ?: return InlinePaymentMethodCardThreeDSecureUsageXbfee3c7fInspection(
    matchesThreeDSecureUsage = false,
    failures = listOf("ThreeDSecureUsage: expected JSON object"),
  )
  val matchesThreeDSecureUsage = raw["supported"] != null
  return InlinePaymentMethodCardThreeDSecureUsageXbfee3c7fInspection(
    matchesThreeDSecureUsage = matchesThreeDSecureUsage,
    failures = buildList {
      if (!matchesThreeDSecureUsage) add("ThreeDSecureUsage: required properties 'supported' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
