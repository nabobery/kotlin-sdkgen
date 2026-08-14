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
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX76ba806fBranch {
  Branch1,
  InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X882ed887,
}

public sealed class InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX76ba806fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX76ba806fNoMatchException(
  message: String,
) : InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX76ba806fDecodingException(message)

internal data class InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX76ba806fInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X882ed887:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X882ed887).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers/post/requestBody/content/application~1x-www-form-urlencoded/schem
 * a/properties/invoice_settings/properties/custom_fields.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers/post/requestBody/content/application~1x-www-form-urlencoded/schem
 * a/properties/invoice_settings/properties/custom_fields
 */
@Serializable(with = InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX76ba806f.Serializer::class)
public class InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX76ba806f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX76ba806fInspection,
) {
  public val branch1:
      List<InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf1ItemX8680a5e4>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf1ItemX8680a5e4>>(raw) else null }

  public val inlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X882ed887:
      InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X882ed887? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X882ed887) json.decodeFromJsonElement<InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X882ed887>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX76ba806fBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX76ba806fBranch.Branch1)
      if (inspection.matchesInlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X882ed887) add(InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX76ba806fBranch.InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X882ed887)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX76ba806f {
      val inspection = inspectInlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX76ba806f(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX76ba806fNoMatchException("InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX76ba806f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX76ba806f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX76ba806f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX76ba806f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX76ba806f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX76ba806f) {
      encoder.requireJsonEncoder("InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX76ba806f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX76ba806f(element: JsonElement): InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX76ba806fInspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf1ItemX8680a5e4>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X882ed887 = element.isJsonDecodable<InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X882ed887>()
  return InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX76ba806fInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X882ed887 = matchesInlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X882ed887,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X882ed887) add("InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X882ed887: value does not match InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X882ed887")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
