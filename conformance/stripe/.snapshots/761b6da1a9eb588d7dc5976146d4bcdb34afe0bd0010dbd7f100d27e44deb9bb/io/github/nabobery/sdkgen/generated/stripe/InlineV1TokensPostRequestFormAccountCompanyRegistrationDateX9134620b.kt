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

public enum class InlineV1TokensPostRequestFormAccountCompanyRegistrationDateX9134620bBranch {
  InlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf1X59a1fdd7,
  InlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf2Xaef67776,
}

public sealed class InlineV1TokensPostRequestFormAccountCompanyRegistrationDateX9134620bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TokensPostRequestFormAccountCompanyRegistrationDateX9134620bNoMatchException(
  message: String,
) : InlineV1TokensPostRequestFormAccountCompanyRegistrationDateX9134620bDecodingException(message)

internal data class InlineV1TokensPostRequestFormAccountCompanyRegistrationDateX9134620bInspection(
  public val matchesInlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf1X59a1fdd7:
      Boolean,
  public val matchesInlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf2Xaef67776:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf1X59a1fdd7, matchesInlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf2Xaef67776).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/account/properties/company/properties/registration_date.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/account/properties/company/properties/registration_date
 */
@Serializable(with = InlineV1TokensPostRequestFormAccountCompanyRegistrationDateX9134620b.Serializer::class)
public class InlineV1TokensPostRequestFormAccountCompanyRegistrationDateX9134620b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1TokensPostRequestFormAccountCompanyRegistrationDateX9134620bInspection,
) {
  public val inlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf1X59a1fdd7:
      InlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf1X59a1fdd7? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf1X59a1fdd7) json.decodeFromJsonElement<InlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf1X59a1fdd7>(raw) else null }

  public val inlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf2Xaef67776:
      InlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf2Xaef67776? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf2Xaef67776) json.decodeFromJsonElement<InlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf2Xaef67776>(raw) else null }

  public val matchedBranches:
      Set<InlineV1TokensPostRequestFormAccountCompanyRegistrationDateX9134620bBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf1X59a1fdd7) add(InlineV1TokensPostRequestFormAccountCompanyRegistrationDateX9134620bBranch.InlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf1X59a1fdd7)
      if (inspection.matchesInlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf2Xaef67776) add(InlineV1TokensPostRequestFormAccountCompanyRegistrationDateX9134620bBranch.InlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf2Xaef67776)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TokensPostRequestFormAccountCompanyRegistrationDateX9134620b {
      val inspection = inspectInlineV1TokensPostRequestFormAccountCompanyRegistrationDateX9134620b(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TokensPostRequestFormAccountCompanyRegistrationDateX9134620bNoMatchException("InlineV1TokensPostRequestFormAccountCompanyRegistrationDateX9134620b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TokensPostRequestFormAccountCompanyRegistrationDateX9134620b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TokensPostRequestFormAccountCompanyRegistrationDateX9134620b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormAccountCompanyRegistrationDateX9134620b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TokensPostRequestFormAccountCompanyRegistrationDateX9134620b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormAccountCompanyRegistrationDateX9134620b) {
      encoder.requireJsonEncoder("InlineV1TokensPostRequestFormAccountCompanyRegistrationDateX9134620b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TokensPostRequestFormAccountCompanyRegistrationDateX9134620b(element: JsonElement): InlineV1TokensPostRequestFormAccountCompanyRegistrationDateX9134620bInspection {
  val matchesInlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf1X59a1fdd7 = element.isJsonDecodable<InlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf1X59a1fdd7>()
  val matchesInlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf2Xaef67776 = element.isJsonDecodable<InlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf2Xaef67776>()
  return InlineV1TokensPostRequestFormAccountCompanyRegistrationDateX9134620bInspection(
    matchesInlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf1X59a1fdd7 = matchesInlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf1X59a1fdd7,
    matchesInlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf2Xaef67776 = matchesInlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf2Xaef67776,
    failures = buildList {
      if (!matchesInlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf1X59a1fdd7) add("InlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf1X59a1fdd7: value does not match InlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf1X59a1fdd7")
      if (!matchesInlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf2Xaef67776) add("InlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf2Xaef67776: value does not match InlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf2Xaef67776")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
