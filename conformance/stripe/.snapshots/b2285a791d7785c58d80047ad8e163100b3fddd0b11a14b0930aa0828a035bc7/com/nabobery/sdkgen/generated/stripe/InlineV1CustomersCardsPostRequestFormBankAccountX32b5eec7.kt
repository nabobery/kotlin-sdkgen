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

public enum class InlineV1CustomersCardsPostRequestFormBankAccountX32b5eec7Branch {
  InlineV1CustomersCardsPostRequestFormBankAccountAnyOf1X93f8721a,
  Branch2,
}

public sealed class InlineV1CustomersCardsPostRequestFormBankAccountX32b5eec7DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersCardsPostRequestFormBankAccountX32b5eec7NoMatchException(
  message: String,
) : InlineV1CustomersCardsPostRequestFormBankAccountX32b5eec7DecodingException(message)

internal data class InlineV1CustomersCardsPostRequestFormBankAccountX32b5eec7Inspection(
  public val matchesInlineV1CustomersCardsPostRequestFormBankAccountAnyOf1X93f8721a: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1CustomersCardsPostRequestFormBankAccountAnyOf1X93f8721a, matchesBranch2).count { it }
}

/**
 * Either a token, like the ones returned by [Stripe.js](https://stripe.com/docs/js), or a dictionary containing a
 * user's bank account details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1cards/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/bank_account
 */
@Serializable(with = InlineV1CustomersCardsPostRequestFormBankAccountX32b5eec7.Serializer::class)
public class InlineV1CustomersCardsPostRequestFormBankAccountX32b5eec7 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1CustomersCardsPostRequestFormBankAccountX32b5eec7Inspection,
) {
  public val inlineV1CustomersCardsPostRequestFormBankAccountAnyOf1X93f8721a:
      InlineV1CustomersCardsPostRequestFormBankAccountAnyOf1X93f8721a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersCardsPostRequestFormBankAccountAnyOf1X93f8721a) json.decodeFromJsonElement<InlineV1CustomersCardsPostRequestFormBankAccountAnyOf1X93f8721a>(raw) else null }

  public val branch2: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<String>(raw) else null }

  public val matchedBranches: Set<InlineV1CustomersCardsPostRequestFormBankAccountX32b5eec7Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1CustomersCardsPostRequestFormBankAccountAnyOf1X93f8721a) add(InlineV1CustomersCardsPostRequestFormBankAccountX32b5eec7Branch.InlineV1CustomersCardsPostRequestFormBankAccountAnyOf1X93f8721a)
      if (inspection.matchesBranch2) add(InlineV1CustomersCardsPostRequestFormBankAccountX32b5eec7Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersCardsPostRequestFormBankAccountX32b5eec7 {
      val inspection = inspectInlineV1CustomersCardsPostRequestFormBankAccountX32b5eec7(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersCardsPostRequestFormBankAccountX32b5eec7NoMatchException("InlineV1CustomersCardsPostRequestFormBankAccountX32b5eec7 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersCardsPostRequestFormBankAccountX32b5eec7(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1CustomersCardsPostRequestFormBankAccountX32b5eec7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersCardsPostRequestFormBankAccountX32b5eec7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersCardsPostRequestFormBankAccountX32b5eec7")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersCardsPostRequestFormBankAccountX32b5eec7) {
      encoder.requireJsonEncoder("InlineV1CustomersCardsPostRequestFormBankAccountX32b5eec7").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersCardsPostRequestFormBankAccountX32b5eec7(element: JsonElement): InlineV1CustomersCardsPostRequestFormBankAccountX32b5eec7Inspection {
  val matchesInlineV1CustomersCardsPostRequestFormBankAccountAnyOf1X93f8721a = element.isJsonDecodable<InlineV1CustomersCardsPostRequestFormBankAccountAnyOf1X93f8721a>()
  val matchesBranch2 = element.isJsonDecodable<String>()
  return InlineV1CustomersCardsPostRequestFormBankAccountX32b5eec7Inspection(
    matchesInlineV1CustomersCardsPostRequestFormBankAccountAnyOf1X93f8721a = matchesInlineV1CustomersCardsPostRequestFormBankAccountAnyOf1X93f8721a,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1CustomersCardsPostRequestFormBankAccountAnyOf1X93f8721a) add("InlineV1CustomersCardsPostRequestFormBankAccountAnyOf1X93f8721a: value does not match InlineV1CustomersCardsPostRequestFormBankAccountAnyOf1X93f8721a")
      if (!matchesBranch2) add("Branch2: value does not match String")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
