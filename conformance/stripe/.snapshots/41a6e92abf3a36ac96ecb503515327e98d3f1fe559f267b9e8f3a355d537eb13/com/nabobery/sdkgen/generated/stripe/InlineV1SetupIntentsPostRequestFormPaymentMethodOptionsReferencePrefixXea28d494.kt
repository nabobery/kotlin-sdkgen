package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixXea28d494Branch {
  Branch1,
  InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitAnyOf2X6266e8d7,
}

public sealed class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixXea28d494DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixXea28d494NoMatchException(
  message: String,
) : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixXea28d494DecodingException(message)

internal data class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixXea28d494Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitAnyOf2X6266e8d7:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitAnyOf2X6266e8d7).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/bacs_debit/properties/mandate_options/properties/referen
 * ce_prefix.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/bacs_debit/properties/mandate_options/properties/referen
 * ce_prefix
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixXea28d494.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixXea28d494 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixXea28d494Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitAnyOf2X6266e8d7:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitAnyOf2X6266e8d7? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitAnyOf2X6266e8d7) json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitAnyOf2X6266e8d7>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixXea28d494Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixXea28d494Branch.Branch1)
      if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitAnyOf2X6266e8d7) add(InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixXea28d494Branch.InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitAnyOf2X6266e8d7)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixXea28d494 {
      val inspection = inspectInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixXea28d494(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixXea28d494NoMatchException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixXea28d494 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixXea28d494(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixXea28d494> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixXea28d494 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixXea28d494")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixXea28d494) {
      encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixXea28d494").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixXea28d494(element: JsonElement): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixXea28d494Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitAnyOf2X6266e8d7 = element.isJsonDecodable<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitAnyOf2X6266e8d7>()
  return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixXea28d494Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitAnyOf2X6266e8d7 = matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitAnyOf2X6266e8d7,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitAnyOf2X6266e8d7) add("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitAnyOf2X6266e8d7: value does not match InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitAnyOf2X6266e8d7")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
