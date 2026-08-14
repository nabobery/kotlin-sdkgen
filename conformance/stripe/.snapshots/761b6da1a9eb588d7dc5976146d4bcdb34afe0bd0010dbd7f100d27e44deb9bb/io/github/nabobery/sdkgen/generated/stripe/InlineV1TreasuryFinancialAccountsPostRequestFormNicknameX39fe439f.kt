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

public enum class InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX39fe439fBranch {
  Branch1,
  InlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X5fd1855c,
}

public sealed class InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX39fe439fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX39fe439fNoMatchException(
  message: String,
) : InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX39fe439fDecodingException(message)

internal data class InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX39fe439fInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X5fd1855c:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X5fd1855c).count { it }
}

/**
 * The nickname for the FinancialAccount.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/nickname
 */
@Serializable(with = InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX39fe439f.Serializer::class)
public class InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX39fe439f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX39fe439fInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X5fd1855c:
      InlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X5fd1855c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X5fd1855c) json.decodeFromJsonElement<InlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X5fd1855c>(raw) else null }

  public val matchedBranches:
      Set<InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX39fe439fBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX39fe439fBranch.Branch1)
      if (inspection.matchesInlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X5fd1855c) add(InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX39fe439fBranch.InlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X5fd1855c)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX39fe439f {
      val inspection = inspectInlineV1TreasuryFinancialAccountsPostRequestFormNicknameX39fe439f(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX39fe439fNoMatchException("InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX39fe439f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX39fe439f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX39fe439f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX39fe439f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX39fe439f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX39fe439f) {
      encoder.requireJsonEncoder("InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX39fe439f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TreasuryFinancialAccountsPostRequestFormNicknameX39fe439f(element: JsonElement): InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX39fe439fInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X5fd1855c = element.isJsonDecodable<InlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X5fd1855c>()
  return InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX39fe439fInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X5fd1855c = matchesInlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X5fd1855c,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X5fd1855c) add("InlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X5fd1855c: value does not match InlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X5fd1855c")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
