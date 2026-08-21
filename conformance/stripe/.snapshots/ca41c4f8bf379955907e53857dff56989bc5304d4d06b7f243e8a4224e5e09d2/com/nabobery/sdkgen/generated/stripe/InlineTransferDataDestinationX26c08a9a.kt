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

public enum class InlineTransferDataDestinationX26c08a9aBranch {
  Branch1,
  Account,
}

public sealed class InlineTransferDataDestinationX26c08a9aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineTransferDataDestinationX26c08a9aNoMatchException(
  message: String,
) : InlineTransferDataDestinationX26c08a9aDecodingException(message)

internal data class InlineTransferDataDestinationX26c08a9aInspection(
  public val matchesBranch1: Boolean,
  public val matchesAccount: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesAccount).count { it }
}

/**
 * The account (if any) that the payment is attributed to for tax reporting, and where funds from the payment are
 * transferred to after payment success.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/transfer_data/properties/destination
 */
@Serializable(with = InlineTransferDataDestinationX26c08a9a.Serializer::class)
public class InlineTransferDataDestinationX26c08a9a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTransferDataDestinationX26c08a9aInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val account: Account? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAccount) json.decodeFromJsonElement<Account>(raw) else null }

  public val matchedBranches: Set<InlineTransferDataDestinationX26c08a9aBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineTransferDataDestinationX26c08a9aBranch.Branch1)
      if (inspection.matchesAccount) add(InlineTransferDataDestinationX26c08a9aBranch.Account)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTransferDataDestinationX26c08a9a {
      val inspection = inspectInlineTransferDataDestinationX26c08a9a(raw)
      if (inspection.matchCount == 0) {
        throw InlineTransferDataDestinationX26c08a9aNoMatchException("InlineTransferDataDestinationX26c08a9a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTransferDataDestinationX26c08a9a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineTransferDataDestinationX26c08a9a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTransferDataDestinationX26c08a9a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTransferDataDestinationX26c08a9a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTransferDataDestinationX26c08a9a) {
      encoder.requireJsonEncoder("InlineTransferDataDestinationX26c08a9a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTransferDataDestinationX26c08a9a(element: JsonElement): InlineTransferDataDestinationX26c08a9aInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesAccount = element.isJsonDecodable<Account>()
  return InlineTransferDataDestinationX26c08a9aInspection(
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
