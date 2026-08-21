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

public enum class InlineV1CustomersBankAccountsPostRequestFormCardX6337a169Branch {
  InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a,
  Branch2,
}

public sealed class InlineV1CustomersBankAccountsPostRequestFormCardX6337a169DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersBankAccountsPostRequestFormCardX6337a169NoMatchException(
  message: String,
) : InlineV1CustomersBankAccountsPostRequestFormCardX6337a169DecodingException(message)

internal data class InlineV1CustomersBankAccountsPostRequestFormCardX6337a169Inspection(
  public val matchesInlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a, matchesBranch2).count { it }
}

/**
 * A token, like the ones returned by [Stripe.js](https://stripe.com/docs/js).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1bank_accounts/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/card
 */
@Serializable(with = InlineV1CustomersBankAccountsPostRequestFormCardX6337a169.Serializer::class)
public class InlineV1CustomersBankAccountsPostRequestFormCardX6337a169 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1CustomersBankAccountsPostRequestFormCardX6337a169Inspection,
) {
  public val inlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a:
      InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a) json.decodeFromJsonElement<InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a>(raw) else null }

  public val branch2: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<String>(raw) else null }

  public val matchedBranches: Set<InlineV1CustomersBankAccountsPostRequestFormCardX6337a169Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a) add(InlineV1CustomersBankAccountsPostRequestFormCardX6337a169Branch.InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a)
      if (inspection.matchesBranch2) add(InlineV1CustomersBankAccountsPostRequestFormCardX6337a169Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersBankAccountsPostRequestFormCardX6337a169 {
      val inspection = inspectInlineV1CustomersBankAccountsPostRequestFormCardX6337a169(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersBankAccountsPostRequestFormCardX6337a169NoMatchException("InlineV1CustomersBankAccountsPostRequestFormCardX6337a169 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersBankAccountsPostRequestFormCardX6337a169(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersBankAccountsPostRequestFormCardX6337a169> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersBankAccountsPostRequestFormCardX6337a169 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersBankAccountsPostRequestFormCardX6337a169")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersBankAccountsPostRequestFormCardX6337a169) {
      encoder.requireJsonEncoder("InlineV1CustomersBankAccountsPostRequestFormCardX6337a169").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersBankAccountsPostRequestFormCardX6337a169(element: JsonElement): InlineV1CustomersBankAccountsPostRequestFormCardX6337a169Inspection {
  val matchesInlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a = element.isJsonDecodable<InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a>()
  val matchesBranch2 = element.isJsonDecodable<String>()
  return InlineV1CustomersBankAccountsPostRequestFormCardX6337a169Inspection(
    matchesInlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a = matchesInlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a) add("InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a: value does not match InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a")
      if (!matchesBranch2) add("Branch2: value does not match String")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
