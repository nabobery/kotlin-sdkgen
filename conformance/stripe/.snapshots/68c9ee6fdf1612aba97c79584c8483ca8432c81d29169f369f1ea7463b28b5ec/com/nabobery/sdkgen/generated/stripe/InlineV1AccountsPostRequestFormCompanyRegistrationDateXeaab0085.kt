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

public enum class InlineV1AccountsPostRequestFormCompanyRegistrationDateXeaab0085Branch {
  InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf1Xbe74beef,
  InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X5f0d56ff,
}

public sealed class InlineV1AccountsPostRequestFormCompanyRegistrationDateXeaab0085DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsPostRequestFormCompanyRegistrationDateXeaab0085NoMatchException(
  message: String,
) : InlineV1AccountsPostRequestFormCompanyRegistrationDateXeaab0085DecodingException(message)

internal data class InlineV1AccountsPostRequestFormCompanyRegistrationDateXeaab0085Inspection(
  public val matchesInlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf1Xbe74beef: Boolean,
  public val matchesInlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X5f0d56ff: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf1Xbe74beef, matchesInlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X5f0d56ff).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/company/properties/registration_date.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/company/properties/registration_date
 */
@Serializable(with = InlineV1AccountsPostRequestFormCompanyRegistrationDateXeaab0085.Serializer::class)
public class InlineV1AccountsPostRequestFormCompanyRegistrationDateXeaab0085 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1AccountsPostRequestFormCompanyRegistrationDateXeaab0085Inspection,
) {
  public val inlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf1Xbe74beef:
      InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf1Xbe74beef? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf1Xbe74beef) json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf1Xbe74beef>(raw) else null }

  public val inlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X5f0d56ff:
      InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X5f0d56ff? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X5f0d56ff) json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X5f0d56ff>(raw) else null }

  public val matchedBranches:
      Set<InlineV1AccountsPostRequestFormCompanyRegistrationDateXeaab0085Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf1Xbe74beef) add(InlineV1AccountsPostRequestFormCompanyRegistrationDateXeaab0085Branch.InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf1Xbe74beef)
      if (inspection.matchesInlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X5f0d56ff) add(InlineV1AccountsPostRequestFormCompanyRegistrationDateXeaab0085Branch.InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X5f0d56ff)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsPostRequestFormCompanyRegistrationDateXeaab0085 {
      val inspection = inspectInlineV1AccountsPostRequestFormCompanyRegistrationDateXeaab0085(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsPostRequestFormCompanyRegistrationDateXeaab0085NoMatchException("InlineV1AccountsPostRequestFormCompanyRegistrationDateXeaab0085 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsPostRequestFormCompanyRegistrationDateXeaab0085(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormCompanyRegistrationDateXeaab0085> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormCompanyRegistrationDateXeaab0085 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormCompanyRegistrationDateXeaab0085")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormCompanyRegistrationDateXeaab0085) {
      encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormCompanyRegistrationDateXeaab0085").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsPostRequestFormCompanyRegistrationDateXeaab0085(element: JsonElement): InlineV1AccountsPostRequestFormCompanyRegistrationDateXeaab0085Inspection {
  val matchesInlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf1Xbe74beef = element.isJsonDecodable<InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf1Xbe74beef>()
  val matchesInlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X5f0d56ff = element.isJsonDecodable<InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X5f0d56ff>()
  return InlineV1AccountsPostRequestFormCompanyRegistrationDateXeaab0085Inspection(
    matchesInlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf1Xbe74beef = matchesInlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf1Xbe74beef,
    matchesInlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X5f0d56ff = matchesInlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X5f0d56ff,
    failures = buildList {
      if (!matchesInlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf1Xbe74beef) add("InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf1Xbe74beef: value does not match InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf1Xbe74beef")
      if (!matchesInlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X5f0d56ff) add("InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X5f0d56ff: value does not match InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X5f0d56ff")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
