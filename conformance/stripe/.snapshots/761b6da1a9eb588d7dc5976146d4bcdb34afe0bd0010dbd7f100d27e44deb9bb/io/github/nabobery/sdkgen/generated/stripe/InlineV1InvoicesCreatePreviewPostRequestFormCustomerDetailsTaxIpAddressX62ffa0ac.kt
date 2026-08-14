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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIpAddressX62ffa0acBranch {
  Branch1,
  InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxAnyOf2X32efd94b,
}

public sealed class InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIpAddressX62ffa0acDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIpAddressX62ffa0acNoMatchException(
  message: String,
) : InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIpAddressX62ffa0acDecodingException(message)

internal data class InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIpAddressX62ffa0acInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxAnyOf2X32efd94b:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxAnyOf2X32efd94b).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/customer_details/properties/tax/properties/ip_address.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/customer_details/properties/tax/properties/ip_address
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIpAddressX62ffa0ac.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIpAddressX62ffa0ac internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIpAddressX62ffa0acInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxAnyOf2X32efd94b:
      InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxAnyOf2X32efd94b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxAnyOf2X32efd94b) json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxAnyOf2X32efd94b>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIpAddressX62ffa0acBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIpAddressX62ffa0acBranch.Branch1)
      if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxAnyOf2X32efd94b) add(InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIpAddressX62ffa0acBranch.InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxAnyOf2X32efd94b)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIpAddressX62ffa0ac {
      val inspection = inspectInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIpAddressX62ffa0ac(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIpAddressX62ffa0acNoMatchException("InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIpAddressX62ffa0ac matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIpAddressX62ffa0ac(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIpAddressX62ffa0ac> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIpAddressX62ffa0ac {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIpAddressX62ffa0ac")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIpAddressX62ffa0ac) {
      encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIpAddressX62ffa0ac").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIpAddressX62ffa0ac(element: JsonElement): InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIpAddressX62ffa0acInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxAnyOf2X32efd94b = element.isJsonDecodable<InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxAnyOf2X32efd94b>()
  return InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIpAddressX62ffa0acInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxAnyOf2X32efd94b = matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxAnyOf2X32efd94b,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxAnyOf2X32efd94b) add("InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxAnyOf2X32efd94b: value does not match InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxAnyOf2X32efd94b")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
