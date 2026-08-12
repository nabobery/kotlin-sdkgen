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

public enum class InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfc390489Branch {
  Branch1,
  InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X73ce1fdd,
}

public sealed class InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfc390489DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfc390489NoMatchException(
  message: String,
) : InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfc390489DecodingException(message)

internal data class InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfc390489Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X73ce1fdd: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X73ce1fdd).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/settings/properties/card_payments/properties/statement_descriptor_prefix_kana.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/settings/properties/card_payments/properties/statement_descriptor_prefix_kana
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfc390489.Serializer::class)
public class InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfc390489 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfc390489Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X73ce1fdd:
      InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X73ce1fdd? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X73ce1fdd) json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X73ce1fdd>(raw) else null }

  public val matchedBranches:
      Set<InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfc390489Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfc390489Branch.Branch1)
      if (inspection.matchesInlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X73ce1fdd) add(InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfc390489Branch.InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X73ce1fdd)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfc390489 {
      val inspection = inspectInlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfc390489(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfc390489NoMatchException("InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfc390489 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfc390489(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfc390489> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfc390489 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfc390489")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfc390489) {
      encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfc390489").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfc390489(element: JsonElement): InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfc390489Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X73ce1fdd = element.isJsonDecodable<InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X73ce1fdd>()
  return InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfc390489Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X73ce1fdd = matchesInlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X73ce1fdd,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X73ce1fdd) add("InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X73ce1fdd: value does not match InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X73ce1fdd")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
