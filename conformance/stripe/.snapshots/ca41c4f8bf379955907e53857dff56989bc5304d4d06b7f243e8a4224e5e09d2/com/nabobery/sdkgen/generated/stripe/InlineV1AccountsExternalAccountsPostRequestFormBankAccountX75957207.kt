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

public enum class InlineV1AccountsExternalAccountsPostRequestFormBankAccountX75957207Branch {
  InlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4,
  Branch2,
}

public sealed class InlineV1AccountsExternalAccountsPostRequestFormBankAccountX75957207DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsExternalAccountsPostRequestFormBankAccountX75957207NoMatchException(
  message: String,
) : InlineV1AccountsExternalAccountsPostRequestFormBankAccountX75957207DecodingException(message)

internal data class InlineV1AccountsExternalAccountsPostRequestFormBankAccountX75957207Inspection(
  public val matchesInlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4:
      Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4, matchesBranch2).count { it }
}

/**
 * Either a token, like the ones returned by [Stripe.js](https://stripe.com/docs/js), or a dictionary containing a
 * user's bank account details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1external_accounts/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/bank_account
 */
@Serializable(with = InlineV1AccountsExternalAccountsPostRequestFormBankAccountX75957207.Serializer::class)
public class InlineV1AccountsExternalAccountsPostRequestFormBankAccountX75957207 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1AccountsExternalAccountsPostRequestFormBankAccountX75957207Inspection,
) {
  public val inlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4:
      InlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4) json.decodeFromJsonElement<InlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4>(raw) else null }

  public val branch2: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<String>(raw) else null }

  public val matchedBranches:
      Set<InlineV1AccountsExternalAccountsPostRequestFormBankAccountX75957207Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4) add(InlineV1AccountsExternalAccountsPostRequestFormBankAccountX75957207Branch.InlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4)
      if (inspection.matchesBranch2) add(InlineV1AccountsExternalAccountsPostRequestFormBankAccountX75957207Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsExternalAccountsPostRequestFormBankAccountX75957207 {
      val inspection = inspectInlineV1AccountsExternalAccountsPostRequestFormBankAccountX75957207(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsExternalAccountsPostRequestFormBankAccountX75957207NoMatchException("InlineV1AccountsExternalAccountsPostRequestFormBankAccountX75957207 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsExternalAccountsPostRequestFormBankAccountX75957207(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsExternalAccountsPostRequestFormBankAccountX75957207> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsExternalAccountsPostRequestFormBankAccountX75957207 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsExternalAccountsPostRequestFormBankAccountX75957207")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsExternalAccountsPostRequestFormBankAccountX75957207) {
      encoder.requireJsonEncoder("InlineV1AccountsExternalAccountsPostRequestFormBankAccountX75957207").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsExternalAccountsPostRequestFormBankAccountX75957207(element: JsonElement): InlineV1AccountsExternalAccountsPostRequestFormBankAccountX75957207Inspection {
  val matchesInlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4 = element.isJsonDecodable<InlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4>()
  val matchesBranch2 = element.isJsonDecodable<String>()
  return InlineV1AccountsExternalAccountsPostRequestFormBankAccountX75957207Inspection(
    matchesInlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4 = matchesInlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4) add("InlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4: value does not match InlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4")
      if (!matchesBranch2) add("Branch2: value does not match String")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
