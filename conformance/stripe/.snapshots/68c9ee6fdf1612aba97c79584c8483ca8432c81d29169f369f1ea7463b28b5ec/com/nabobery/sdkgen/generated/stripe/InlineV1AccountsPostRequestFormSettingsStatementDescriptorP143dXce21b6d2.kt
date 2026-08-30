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

public enum class InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dXce21b6d2Branch {
  Branch1,
  InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X42cf5631,
}

public sealed class InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dXce21b6d2DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dXce21b6d2NoMatchException(
  message: String,
) : InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dXce21b6d2DecodingException(message)

internal data class InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dXce21b6d2Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X42cf5631: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X42cf5631).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/settings/properties/card_payments/properties/statement_descriptor_prefix_kanji.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/settings/properties/card_payments/properties/statement_descriptor_prefix_kanji
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dXce21b6d2.Serializer::class)
public class InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dXce21b6d2 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dXce21b6d2Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X42cf5631:
      InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X42cf5631? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X42cf5631) json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X42cf5631>(raw) else null }

  public val matchedBranches:
      Set<InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dXce21b6d2Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dXce21b6d2Branch.Branch1)
      if (inspection.matchesInlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X42cf5631) add(InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dXce21b6d2Branch.InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X42cf5631)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dXce21b6d2 {
      val inspection = inspectInlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dXce21b6d2(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dXce21b6d2NoMatchException("InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dXce21b6d2 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dXce21b6d2(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dXce21b6d2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dXce21b6d2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dXce21b6d2")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dXce21b6d2) {
      encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dXce21b6d2").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dXce21b6d2(element: JsonElement): InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dXce21b6d2Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X42cf5631 = element.isJsonDecodable<InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X42cf5631>()
  return InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dXce21b6d2Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X42cf5631 = matchesInlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X42cf5631,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X42cf5631) add("InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X42cf5631: value does not match InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X42cf5631")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
