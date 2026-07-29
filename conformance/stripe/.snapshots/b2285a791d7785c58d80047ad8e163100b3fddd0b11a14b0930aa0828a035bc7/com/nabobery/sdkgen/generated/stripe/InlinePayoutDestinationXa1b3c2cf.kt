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

public enum class InlinePayoutDestinationXa1b3c2cfBranch {
  Branch1,
  BankAccount,
  Card,
  DeletedBankAccount,
  DeletedCard,
}

public sealed class InlinePayoutDestinationXa1b3c2cfDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePayoutDestinationXa1b3c2cfNoMatchException(
  message: String,
) : InlinePayoutDestinationXa1b3c2cfDecodingException(message)

internal data class InlinePayoutDestinationXa1b3c2cfInspection(
  public val matchesBranch1: Boolean,
  public val matchesBankAccount: Boolean,
  public val matchesCard: Boolean,
  public val matchesDeletedBankAccount: Boolean,
  public val matchesDeletedCard: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBankAccount, matchesCard, matchesDeletedBankAccount, matchesDeletedCard).count { it }
}

/**
 * ID of the bank account or card the payout is sent to.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payout/properties/destination
 */
@Serializable(with = InlinePayoutDestinationXa1b3c2cf.Serializer::class)
public class InlinePayoutDestinationXa1b3c2cf internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePayoutDestinationXa1b3c2cfInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val bankAccount: BankAccount? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBankAccount) json.decodeFromJsonElement<BankAccount>(raw) else null }

  public val card: Card? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCard) json.decodeFromJsonElement<Card>(raw) else null }

  public val deletedBankAccount: DeletedBankAccount? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedBankAccount) json.decodeFromJsonElement<DeletedBankAccount>(raw) else null }

  public val deletedCard: DeletedCard? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedCard) json.decodeFromJsonElement<DeletedCard>(raw) else null }

  public val matchedBranches: Set<InlinePayoutDestinationXa1b3c2cfBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlinePayoutDestinationXa1b3c2cfBranch.Branch1)
      if (inspection.matchesBankAccount) add(InlinePayoutDestinationXa1b3c2cfBranch.BankAccount)
      if (inspection.matchesCard) add(InlinePayoutDestinationXa1b3c2cfBranch.Card)
      if (inspection.matchesDeletedBankAccount) add(InlinePayoutDestinationXa1b3c2cfBranch.DeletedBankAccount)
      if (inspection.matchesDeletedCard) add(InlinePayoutDestinationXa1b3c2cfBranch.DeletedCard)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePayoutDestinationXa1b3c2cf {
      val inspection = inspectInlinePayoutDestinationXa1b3c2cf(raw)
      if (inspection.matchCount == 0) {
        throw InlinePayoutDestinationXa1b3c2cfNoMatchException("InlinePayoutDestinationXa1b3c2cf matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePayoutDestinationXa1b3c2cf(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePayoutDestinationXa1b3c2cf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePayoutDestinationXa1b3c2cf {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePayoutDestinationXa1b3c2cf")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePayoutDestinationXa1b3c2cf) {
      encoder.requireJsonEncoder("InlinePayoutDestinationXa1b3c2cf").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePayoutDestinationXa1b3c2cf(element: JsonElement): InlinePayoutDestinationXa1b3c2cfInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBankAccount = element.isJsonDecodable<BankAccount>()
  val matchesCard = element.isJsonDecodable<Card>()
  val matchesDeletedBankAccount = element.isJsonDecodable<DeletedBankAccount>()
  val matchesDeletedCard = element.isJsonDecodable<DeletedCard>()
  return InlinePayoutDestinationXa1b3c2cfInspection(
    matchesBranch1 = matchesBranch1,
    matchesBankAccount = matchesBankAccount,
    matchesCard = matchesCard,
    matchesDeletedBankAccount = matchesDeletedBankAccount,
    matchesDeletedCard = matchesDeletedCard,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesBankAccount) add("BankAccount: value does not match BankAccount")
      if (!matchesCard) add("Card: value does not match Card")
      if (!matchesDeletedBankAccount) add("DeletedBankAccount: value does not match DeletedBankAccount")
      if (!matchesDeletedCard) add("DeletedCard: value does not match DeletedCard")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
