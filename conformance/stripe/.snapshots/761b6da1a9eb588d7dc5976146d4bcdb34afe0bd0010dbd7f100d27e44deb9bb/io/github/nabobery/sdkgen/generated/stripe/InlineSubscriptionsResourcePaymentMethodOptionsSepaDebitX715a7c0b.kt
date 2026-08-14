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

@Serializable
public class InlineSubscriptionsResourcePaymentMethodOptionsSepaDebitX715a7c0bBranch1View()

public enum class InlineSubscriptionsResourcePaymentMethodOptionsSepaDebitX715a7c0bBranch {
  Branch1,
}

public sealed class InlineSubscriptionsResourcePaymentMethodOptionsSepaDebitX715a7c0bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionsResourcePaymentMethodOptionsSepaDebitX715a7c0bNoMatchException(
  message: String,
) : InlineSubscriptionsResourcePaymentMethodOptionsSepaDebitX715a7c0bDecodingException(message)

internal data class InlineSubscriptionsResourcePaymentMethodOptionsSepaDebitX715a7c0bInspection(
  public val matchesBranch1: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1).count { it }
}

/**
 * This sub-hash contains details about the SEPA Direct Debit payment method options to pass to invoices created by the
 * subscription.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_payment_method_options/properties/sepa_debit
 */
@Serializable(with = InlineSubscriptionsResourcePaymentMethodOptionsSepaDebitX715a7c0b.Serializer::class)
public class InlineSubscriptionsResourcePaymentMethodOptionsSepaDebitX715a7c0b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineSubscriptionsResourcePaymentMethodOptionsSepaDebitX715a7c0bInspection,
) {
  public val branch1: InlineSubscriptionsResourcePaymentMethodOptionsSepaDebitX715a7c0bBranch1View?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<InlineSubscriptionsResourcePaymentMethodOptionsSepaDebitX715a7c0bBranch1View>(raw) else null }

  public val matchedBranches:
      Set<InlineSubscriptionsResourcePaymentMethodOptionsSepaDebitX715a7c0bBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineSubscriptionsResourcePaymentMethodOptionsSepaDebitX715a7c0bBranch.Branch1)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionsResourcePaymentMethodOptionsSepaDebitX715a7c0b {
      val inspection = inspectInlineSubscriptionsResourcePaymentMethodOptionsSepaDebitX715a7c0b(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionsResourcePaymentMethodOptionsSepaDebitX715a7c0bNoMatchException("InlineSubscriptionsResourcePaymentMethodOptionsSepaDebitX715a7c0b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionsResourcePaymentMethodOptionsSepaDebitX715a7c0b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionsResourcePaymentMethodOptionsSepaDebitX715a7c0b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionsResourcePaymentMethodOptionsSepaDebitX715a7c0b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionsResourcePaymentMethodOptionsSepaDebitX715a7c0b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionsResourcePaymentMethodOptionsSepaDebitX715a7c0b) {
      encoder.requireJsonEncoder("InlineSubscriptionsResourcePaymentMethodOptionsSepaDebitX715a7c0b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionsResourcePaymentMethodOptionsSepaDebitX715a7c0b(element: JsonElement): InlineSubscriptionsResourcePaymentMethodOptionsSepaDebitX715a7c0bInspection {
  val raw = element as? JsonObject ?: return InlineSubscriptionsResourcePaymentMethodOptionsSepaDebitX715a7c0bInspection(
    matchesBranch1 = false,
    failures = listOf("Branch1: expected JSON object"),
  )
  val matchesBranch1 = true
  return InlineSubscriptionsResourcePaymentMethodOptionsSepaDebitX715a7c0bInspection(
    matchesBranch1 = matchesBranch1,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
