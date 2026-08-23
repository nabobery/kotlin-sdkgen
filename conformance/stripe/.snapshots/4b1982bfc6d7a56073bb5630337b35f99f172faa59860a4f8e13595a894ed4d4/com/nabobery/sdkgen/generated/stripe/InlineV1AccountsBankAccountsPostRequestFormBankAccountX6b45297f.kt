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

public enum class InlineV1AccountsBankAccountsPostRequestFormBankAccountX6b45297fBranch {
  InlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1X21285d7e,
  Branch2,
}

public sealed class InlineV1AccountsBankAccountsPostRequestFormBankAccountX6b45297fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsBankAccountsPostRequestFormBankAccountX6b45297fNoMatchException(
  message: String,
) : InlineV1AccountsBankAccountsPostRequestFormBankAccountX6b45297fDecodingException(message)

internal data class InlineV1AccountsBankAccountsPostRequestFormBankAccountX6b45297fInspection(
  public val matchesInlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1X21285d7e: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1X21285d7e, matchesBranch2).count { it }
}

/**
 * Either a token, like the ones returned by [Stripe.js](https://stripe.com/docs/js), or a dictionary containing a
 * user's bank account details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1bank_accounts/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/bank_account
 */
@Serializable(with = InlineV1AccountsBankAccountsPostRequestFormBankAccountX6b45297f.Serializer::class)
public class InlineV1AccountsBankAccountsPostRequestFormBankAccountX6b45297f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1AccountsBankAccountsPostRequestFormBankAccountX6b45297fInspection,
) {
  public val inlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1X21285d7e:
      InlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1X21285d7e? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1X21285d7e) json.decodeFromJsonElement<InlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1X21285d7e>(raw) else null }

  public val branch2: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<String>(raw) else null }

  public val matchedBranches:
      Set<InlineV1AccountsBankAccountsPostRequestFormBankAccountX6b45297fBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1X21285d7e) add(InlineV1AccountsBankAccountsPostRequestFormBankAccountX6b45297fBranch.InlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1X21285d7e)
      if (inspection.matchesBranch2) add(InlineV1AccountsBankAccountsPostRequestFormBankAccountX6b45297fBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsBankAccountsPostRequestFormBankAccountX6b45297f {
      val inspection = inspectInlineV1AccountsBankAccountsPostRequestFormBankAccountX6b45297f(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsBankAccountsPostRequestFormBankAccountX6b45297fNoMatchException("InlineV1AccountsBankAccountsPostRequestFormBankAccountX6b45297f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsBankAccountsPostRequestFormBankAccountX6b45297f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsBankAccountsPostRequestFormBankAccountX6b45297f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsBankAccountsPostRequestFormBankAccountX6b45297f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsBankAccountsPostRequestFormBankAccountX6b45297f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsBankAccountsPostRequestFormBankAccountX6b45297f) {
      encoder.requireJsonEncoder("InlineV1AccountsBankAccountsPostRequestFormBankAccountX6b45297f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsBankAccountsPostRequestFormBankAccountX6b45297f(element: JsonElement): InlineV1AccountsBankAccountsPostRequestFormBankAccountX6b45297fInspection {
  val matchesInlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1X21285d7e = element.isJsonDecodable<InlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1X21285d7e>()
  val matchesBranch2 = element.isJsonDecodable<String>()
  return InlineV1AccountsBankAccountsPostRequestFormBankAccountX6b45297fInspection(
    matchesInlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1X21285d7e = matchesInlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1X21285d7e,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1X21285d7e) add("InlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1X21285d7e: value does not match InlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1X21285d7e")
      if (!matchesBranch2) add("Branch2: value does not match String")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
