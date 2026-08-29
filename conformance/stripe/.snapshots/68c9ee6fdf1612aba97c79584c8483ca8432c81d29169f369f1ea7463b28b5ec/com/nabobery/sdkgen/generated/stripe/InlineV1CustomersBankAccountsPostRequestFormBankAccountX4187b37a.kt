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

public enum class InlineV1CustomersBankAccountsPostRequestFormBankAccountX4187b37aBranch {
  InlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596,
  Branch2,
}

public sealed class InlineV1CustomersBankAccountsPostRequestFormBankAccountX4187b37aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersBankAccountsPostRequestFormBankAccountX4187b37aNoMatchException(
  message: String,
) : InlineV1CustomersBankAccountsPostRequestFormBankAccountX4187b37aDecodingException(message)

internal data class InlineV1CustomersBankAccountsPostRequestFormBankAccountX4187b37aInspection(
  public val matchesInlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596, matchesBranch2).count { it }
}

/**
 * Either a token, like the ones returned by [Stripe.js](https://stripe.com/docs/js), or a dictionary containing a
 * user's bank account details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1bank_accounts/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/bank_account
 */
@Serializable(with = InlineV1CustomersBankAccountsPostRequestFormBankAccountX4187b37a.Serializer::class)
public class InlineV1CustomersBankAccountsPostRequestFormBankAccountX4187b37a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CustomersBankAccountsPostRequestFormBankAccountX4187b37aInspection,
) {
  public val inlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596:
      InlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596) json.decodeFromJsonElement<InlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596>(raw) else null }

  public val branch2: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<String>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersBankAccountsPostRequestFormBankAccountX4187b37aBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596) add(InlineV1CustomersBankAccountsPostRequestFormBankAccountX4187b37aBranch.InlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596)
      if (inspection.matchesBranch2) add(InlineV1CustomersBankAccountsPostRequestFormBankAccountX4187b37aBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersBankAccountsPostRequestFormBankAccountX4187b37a {
      val inspection = inspectInlineV1CustomersBankAccountsPostRequestFormBankAccountX4187b37a(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersBankAccountsPostRequestFormBankAccountX4187b37aNoMatchException("InlineV1CustomersBankAccountsPostRequestFormBankAccountX4187b37a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersBankAccountsPostRequestFormBankAccountX4187b37a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersBankAccountsPostRequestFormBankAccountX4187b37a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersBankAccountsPostRequestFormBankAccountX4187b37a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersBankAccountsPostRequestFormBankAccountX4187b37a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersBankAccountsPostRequestFormBankAccountX4187b37a) {
      encoder.requireJsonEncoder("InlineV1CustomersBankAccountsPostRequestFormBankAccountX4187b37a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersBankAccountsPostRequestFormBankAccountX4187b37a(element: JsonElement): InlineV1CustomersBankAccountsPostRequestFormBankAccountX4187b37aInspection {
  val matchesInlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596 = element.isJsonDecodable<InlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596>()
  val matchesBranch2 = element.isJsonDecodable<String>()
  return InlineV1CustomersBankAccountsPostRequestFormBankAccountX4187b37aInspection(
    matchesInlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596 = matchesInlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596) add("InlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596: value does not match InlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596")
      if (!matchesBranch2) add("Branch2: value does not match String")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
