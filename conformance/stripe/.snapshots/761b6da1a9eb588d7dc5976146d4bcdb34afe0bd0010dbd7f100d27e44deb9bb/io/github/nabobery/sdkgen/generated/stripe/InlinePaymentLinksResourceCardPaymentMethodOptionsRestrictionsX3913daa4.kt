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

public enum class InlinePaymentLinksResourceCardPaymentMethodOptionsRestrictionsX3913daa4Branch {
  PaymentLinksResourceCardRestrictions,
}

public sealed class InlinePaymentLinksResourceCardPaymentMethodOptionsRestrictionsX3913daa4DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentLinksResourceCardPaymentMethodOptionsRestrictionsX3913daa4NoMatchException(
  message: String,
) : InlinePaymentLinksResourceCardPaymentMethodOptionsRestrictionsX3913daa4DecodingException(message)

internal data class InlinePaymentLinksResourceCardPaymentMethodOptionsRestrictionsX3913daa4Inspection(
  public val matchesPaymentLinksResourceCardRestrictions: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentLinksResourceCardRestrictions).count { it }
}

/**
 * Restrictions to apply to the card payment method. For example, you can block specific card brands.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_links_resource_card_payment_method_options/properties/restri
 * ctions
 */
@Serializable(with = InlinePaymentLinksResourceCardPaymentMethodOptionsRestrictionsX3913daa4.Serializer::class)
public class InlinePaymentLinksResourceCardPaymentMethodOptionsRestrictionsX3913daa4 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlinePaymentLinksResourceCardPaymentMethodOptionsRestrictionsX3913daa4Inspection,
) {
  public val paymentLinksResourceCardRestrictions: PaymentLinksResourceCardRestrictionsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentLinksResourceCardRestrictions) json.decodeFromJsonElement<PaymentLinksResourceCardRestrictionsView>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentLinksResourceCardPaymentMethodOptionsRestrictionsX3913daa4Branch>
    get() = buildSet {
      if (inspection.matchesPaymentLinksResourceCardRestrictions) add(InlinePaymentLinksResourceCardPaymentMethodOptionsRestrictionsX3913daa4Branch.PaymentLinksResourceCardRestrictions)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentLinksResourceCardPaymentMethodOptionsRestrictionsX3913daa4 {
      val inspection = inspectInlinePaymentLinksResourceCardPaymentMethodOptionsRestrictionsX3913daa4(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentLinksResourceCardPaymentMethodOptionsRestrictionsX3913daa4NoMatchException("InlinePaymentLinksResourceCardPaymentMethodOptionsRestrictionsX3913daa4 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentLinksResourceCardPaymentMethodOptionsRestrictionsX3913daa4(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentLinksResourceCardPaymentMethodOptionsRestrictionsX3913daa4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentLinksResourceCardPaymentMethodOptionsRestrictionsX3913daa4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentLinksResourceCardPaymentMethodOptionsRestrictionsX3913daa4")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentLinksResourceCardPaymentMethodOptionsRestrictionsX3913daa4) {
      encoder.requireJsonEncoder("InlinePaymentLinksResourceCardPaymentMethodOptionsRestrictionsX3913daa4").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentLinksResourceCardPaymentMethodOptionsRestrictionsX3913daa4(element: JsonElement): InlinePaymentLinksResourceCardPaymentMethodOptionsRestrictionsX3913daa4Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentLinksResourceCardPaymentMethodOptionsRestrictionsX3913daa4Inspection(
    matchesPaymentLinksResourceCardRestrictions = false,
    failures = listOf("PaymentLinksResourceCardRestrictions: expected JSON object"),
  )
  val matchesPaymentLinksResourceCardRestrictions = raw["brands_blocked"] != null
  return InlinePaymentLinksResourceCardPaymentMethodOptionsRestrictionsX3913daa4Inspection(
    matchesPaymentLinksResourceCardRestrictions = matchesPaymentLinksResourceCardRestrictions,
    failures = buildList {
      if (!matchesPaymentLinksResourceCardRestrictions) add("PaymentLinksResourceCardRestrictions: required properties 'brands_blocked' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
