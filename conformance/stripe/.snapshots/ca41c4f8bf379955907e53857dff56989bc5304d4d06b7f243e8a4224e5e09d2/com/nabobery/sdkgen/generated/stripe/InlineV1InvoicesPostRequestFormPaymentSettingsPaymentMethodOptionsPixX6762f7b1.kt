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

public enum class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX6762f7b1Branch {
  InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X454a46bc,
  InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X333e2666,
}

public sealed class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX6762f7b1DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX6762f7b1NoMatchException(
  message: String,
) : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX6762f7b1DecodingException(message)

internal data class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX6762f7b1Inspection(
  public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X454a46bc: Boolean,
  public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X333e2666: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X454a46bc, matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X333e2666).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/pix.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/pix
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX6762f7b1.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX6762f7b1 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX6762f7b1Inspection,
) {
  public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X454a46bc:
      InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X454a46bc? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X454a46bc) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X454a46bc>(raw) else null }

  public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X333e2666:
      InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X333e2666? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X333e2666) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X333e2666>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX6762f7b1Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X454a46bc) add(InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX6762f7b1Branch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X454a46bc)
      if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X333e2666) add(InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX6762f7b1Branch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X333e2666)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX6762f7b1 {
      val inspection = inspectInlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX6762f7b1(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX6762f7b1NoMatchException("InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX6762f7b1 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX6762f7b1(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX6762f7b1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX6762f7b1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX6762f7b1")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX6762f7b1) {
      encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX6762f7b1").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX6762f7b1(element: JsonElement): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX6762f7b1Inspection {
  val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X454a46bc = element.isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X454a46bc>()
  val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X333e2666 = element.isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X333e2666>()
  return InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX6762f7b1Inspection(
    matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X454a46bc = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X454a46bc,
    matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X333e2666 = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X333e2666,
    failures = buildList {
      if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X454a46bc) add("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X454a46bc: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X454a46bc")
      if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X333e2666) add("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X333e2666: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X333e2666")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
