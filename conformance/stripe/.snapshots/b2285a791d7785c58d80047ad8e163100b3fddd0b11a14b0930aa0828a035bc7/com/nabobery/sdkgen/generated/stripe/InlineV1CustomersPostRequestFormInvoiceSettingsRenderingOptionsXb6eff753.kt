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

public enum class InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsXb6eff753Branch {
  InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf1X0a61648e,
  InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf2Xc2fdafef,
}

public sealed class InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsXb6eff753DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsXb6eff753NoMatchException(
  message: String,
) : InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsXb6eff753DecodingException(message)

internal data class InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsXb6eff753Inspection(
  public val matchesInlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf1X0a61648e:
      Boolean,
  public val matchesInlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf2Xc2fdafef:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf1X0a61648e, matchesInlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf2Xc2fdafef).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/invoice_settings/properties/rendering_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/invoice_settings/properties/rendering_options
 */
@Serializable(with = InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsXb6eff753.Serializer::class)
public class InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsXb6eff753 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsXb6eff753Inspection,
) {
  public val inlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf1X0a61648e:
      InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf1X0a61648e? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf1X0a61648e) json.decodeFromJsonElement<InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf1X0a61648e>(raw) else null }

  public val inlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf2Xc2fdafef:
      InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf2Xc2fdafef? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf2Xc2fdafef) json.decodeFromJsonElement<InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf2Xc2fdafef>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsXb6eff753Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf1X0a61648e) add(InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsXb6eff753Branch.InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf1X0a61648e)
      if (inspection.matchesInlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf2Xc2fdafef) add(InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsXb6eff753Branch.InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf2Xc2fdafef)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsXb6eff753 {
      val inspection = inspectInlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsXb6eff753(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsXb6eff753NoMatchException("InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsXb6eff753 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsXb6eff753(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsXb6eff753> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsXb6eff753 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsXb6eff753")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsXb6eff753) {
      encoder.requireJsonEncoder("InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsXb6eff753").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsXb6eff753(element: JsonElement): InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsXb6eff753Inspection {
  val matchesInlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf1X0a61648e = element.isJsonDecodable<InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf1X0a61648e>()
  val matchesInlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf2Xc2fdafef = element.isJsonDecodable<InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf2Xc2fdafef>()
  return InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsXb6eff753Inspection(
    matchesInlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf1X0a61648e = matchesInlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf1X0a61648e,
    matchesInlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf2Xc2fdafef = matchesInlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf2Xc2fdafef,
    failures = buildList {
      if (!matchesInlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf1X0a61648e) add("InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf1X0a61648e: value does not match InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf1X0a61648e")
      if (!matchesInlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf2Xc2fdafef) add("InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf2Xc2fdafef: value does not match InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf2Xc2fdafef")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
