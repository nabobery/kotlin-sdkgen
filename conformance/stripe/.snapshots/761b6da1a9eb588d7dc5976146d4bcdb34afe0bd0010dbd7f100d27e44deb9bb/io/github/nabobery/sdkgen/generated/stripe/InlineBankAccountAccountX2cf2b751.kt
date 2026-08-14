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

public enum class InlineBankAccountAccountX2cf2b751Branch {
  Branch1,
  Account,
}

public sealed class InlineBankAccountAccountX2cf2b751DecodingException(
  message: String,
) : SerializationException(message)

public class InlineBankAccountAccountX2cf2b751NoMatchException(
  message: String,
) : InlineBankAccountAccountX2cf2b751DecodingException(message)

internal data class InlineBankAccountAccountX2cf2b751Inspection(
  public val matchesBranch1: Boolean,
  public val matchesAccount: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesAccount).count { it }
}

/**
 * The account this bank account belongs to. Only applicable on Accounts (not customers or recipients) This property is
 * only available when returned as an [External Account](/api/external_account_bank_accounts/object) where
 * [controller.is_controller](/api/accounts/object#account_object-controller-is_controller) is `true`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/bank_account/properties/account
 */
@Serializable(with = InlineBankAccountAccountX2cf2b751.Serializer::class)
public class InlineBankAccountAccountX2cf2b751 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineBankAccountAccountX2cf2b751Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val account: Account? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAccount) json.decodeFromJsonElement<Account>(raw) else null }

  public val matchedBranches: Set<InlineBankAccountAccountX2cf2b751Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineBankAccountAccountX2cf2b751Branch.Branch1)
      if (inspection.matchesAccount) add(InlineBankAccountAccountX2cf2b751Branch.Account)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineBankAccountAccountX2cf2b751 {
      val inspection = inspectInlineBankAccountAccountX2cf2b751(raw)
      if (inspection.matchCount == 0) {
        throw InlineBankAccountAccountX2cf2b751NoMatchException("InlineBankAccountAccountX2cf2b751 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineBankAccountAccountX2cf2b751(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineBankAccountAccountX2cf2b751> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBankAccountAccountX2cf2b751 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBankAccountAccountX2cf2b751")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineBankAccountAccountX2cf2b751) {
      encoder.requireJsonEncoder("InlineBankAccountAccountX2cf2b751").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineBankAccountAccountX2cf2b751(element: JsonElement): InlineBankAccountAccountX2cf2b751Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesAccount = element.isJsonDecodable<Account>()
  return InlineBankAccountAccountX2cf2b751Inspection(
    matchesBranch1 = matchesBranch1,
    matchesAccount = matchesAccount,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesAccount) add("Account: value does not match Account")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
