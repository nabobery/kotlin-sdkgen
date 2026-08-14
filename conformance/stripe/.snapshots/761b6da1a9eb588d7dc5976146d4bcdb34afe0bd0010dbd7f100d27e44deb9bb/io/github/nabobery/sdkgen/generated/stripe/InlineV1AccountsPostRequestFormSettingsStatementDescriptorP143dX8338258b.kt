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

public enum class InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dX8338258bBranch {
  Branch1,
  InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X9dc78c31,
}

public sealed class InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dX8338258bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dX8338258bNoMatchException(
  message: String,
) : InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dX8338258bDecodingException(message)

internal data class InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dX8338258bInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X9dc78c31: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X9dc78c31).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/settings/properties/card_payments/properties/statement_descriptor_prefix_kanji.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/settings/properties/card_payments/properties/statement_descriptor_prefix_kanji
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dX8338258b.Serializer::class)
public class InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dX8338258b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dX8338258bInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X9dc78c31:
      InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X9dc78c31? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X9dc78c31) json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X9dc78c31>(raw) else null }

  public val matchedBranches:
      Set<InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dX8338258bBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dX8338258bBranch.Branch1)
      if (inspection.matchesInlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X9dc78c31) add(InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dX8338258bBranch.InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X9dc78c31)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dX8338258b {
      val inspection = inspectInlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dX8338258b(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dX8338258bNoMatchException("InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dX8338258b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dX8338258b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dX8338258b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dX8338258b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dX8338258b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dX8338258b) {
      encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dX8338258b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dX8338258b(element: JsonElement): InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dX8338258bInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X9dc78c31 = element.isJsonDecodable<InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X9dc78c31>()
  return InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dX8338258bInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X9dc78c31 = matchesInlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X9dc78c31,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X9dc78c31) add("InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X9dc78c31: value does not match InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2X9dc78c31")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
