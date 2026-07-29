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

public enum class InlineV1CustomersSourcesPostRequestFormBankAccountXfb61e7dcBranch {
  InlineV1CustomersSourcesPostRequestFormBankAccountAnyOf1X65d8afb5,
  Branch2,
}

public sealed class InlineV1CustomersSourcesPostRequestFormBankAccountXfb61e7dcDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSourcesPostRequestFormBankAccountXfb61e7dcNoMatchException(
  message: String,
) : InlineV1CustomersSourcesPostRequestFormBankAccountXfb61e7dcDecodingException(message)

internal data class InlineV1CustomersSourcesPostRequestFormBankAccountXfb61e7dcInspection(
  public val matchesInlineV1CustomersSourcesPostRequestFormBankAccountAnyOf1X65d8afb5: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1CustomersSourcesPostRequestFormBankAccountAnyOf1X65d8afb5, matchesBranch2).count { it }
}

/**
 * Either a token, like the ones returned by [Stripe.js](https://stripe.com/docs/js), or a dictionary containing a
 * user's bank account details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1sources/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/bank_account
 */
@Serializable(with = InlineV1CustomersSourcesPostRequestFormBankAccountXfb61e7dc.Serializer::class)
public class InlineV1CustomersSourcesPostRequestFormBankAccountXfb61e7dc internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1CustomersSourcesPostRequestFormBankAccountXfb61e7dcInspection,
) {
  public val inlineV1CustomersSourcesPostRequestFormBankAccountAnyOf1X65d8afb5:
      InlineV1CustomersSourcesPostRequestFormBankAccountAnyOf1X65d8afb5? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSourcesPostRequestFormBankAccountAnyOf1X65d8afb5) json.decodeFromJsonElement<InlineV1CustomersSourcesPostRequestFormBankAccountAnyOf1X65d8afb5>(raw) else null }

  public val branch2: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<String>(raw) else null }

  public val matchedBranches: Set<InlineV1CustomersSourcesPostRequestFormBankAccountXfb61e7dcBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1CustomersSourcesPostRequestFormBankAccountAnyOf1X65d8afb5) add(InlineV1CustomersSourcesPostRequestFormBankAccountXfb61e7dcBranch.InlineV1CustomersSourcesPostRequestFormBankAccountAnyOf1X65d8afb5)
      if (inspection.matchesBranch2) add(InlineV1CustomersSourcesPostRequestFormBankAccountXfb61e7dcBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSourcesPostRequestFormBankAccountXfb61e7dc {
      val inspection = inspectInlineV1CustomersSourcesPostRequestFormBankAccountXfb61e7dc(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSourcesPostRequestFormBankAccountXfb61e7dcNoMatchException("InlineV1CustomersSourcesPostRequestFormBankAccountXfb61e7dc matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSourcesPostRequestFormBankAccountXfb61e7dc(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1CustomersSourcesPostRequestFormBankAccountXfb61e7dc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSourcesPostRequestFormBankAccountXfb61e7dc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSourcesPostRequestFormBankAccountXfb61e7dc")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSourcesPostRequestFormBankAccountXfb61e7dc) {
      encoder.requireJsonEncoder("InlineV1CustomersSourcesPostRequestFormBankAccountXfb61e7dc").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSourcesPostRequestFormBankAccountXfb61e7dc(element: JsonElement): InlineV1CustomersSourcesPostRequestFormBankAccountXfb61e7dcInspection {
  val matchesInlineV1CustomersSourcesPostRequestFormBankAccountAnyOf1X65d8afb5 = element.isJsonDecodable<InlineV1CustomersSourcesPostRequestFormBankAccountAnyOf1X65d8afb5>()
  val matchesBranch2 = element.isJsonDecodable<String>()
  return InlineV1CustomersSourcesPostRequestFormBankAccountXfb61e7dcInspection(
    matchesInlineV1CustomersSourcesPostRequestFormBankAccountAnyOf1X65d8afb5 = matchesInlineV1CustomersSourcesPostRequestFormBankAccountAnyOf1X65d8afb5,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1CustomersSourcesPostRequestFormBankAccountAnyOf1X65d8afb5) add("InlineV1CustomersSourcesPostRequestFormBankAccountAnyOf1X65d8afb5: value does not match InlineV1CustomersSourcesPostRequestFormBankAccountAnyOf1X65d8afb5")
      if (!matchesBranch2) add("Branch2: value does not match String")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
