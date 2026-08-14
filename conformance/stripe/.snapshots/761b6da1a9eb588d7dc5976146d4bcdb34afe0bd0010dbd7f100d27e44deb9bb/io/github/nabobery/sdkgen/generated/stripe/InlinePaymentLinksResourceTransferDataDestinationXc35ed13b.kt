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

public enum class InlinePaymentLinksResourceTransferDataDestinationXc35ed13bBranch {
  Branch1,
  Account,
}

public sealed class InlinePaymentLinksResourceTransferDataDestinationXc35ed13bDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentLinksResourceTransferDataDestinationXc35ed13bNoMatchException(
  message: String,
) : InlinePaymentLinksResourceTransferDataDestinationXc35ed13bDecodingException(message)

internal data class InlinePaymentLinksResourceTransferDataDestinationXc35ed13bInspection(
  public val matchesBranch1: Boolean,
  public val matchesAccount: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesAccount).count { it }
}

/**
 * The connected account receiving the transfer.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_transfer_data/properties/destination
 */
@Serializable(with = InlinePaymentLinksResourceTransferDataDestinationXc35ed13b.Serializer::class)
public class InlinePaymentLinksResourceTransferDataDestinationXc35ed13b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentLinksResourceTransferDataDestinationXc35ed13bInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val account: Account? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAccount) json.decodeFromJsonElement<Account>(raw) else null }

  public val matchedBranches: Set<InlinePaymentLinksResourceTransferDataDestinationXc35ed13bBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlinePaymentLinksResourceTransferDataDestinationXc35ed13bBranch.Branch1)
      if (inspection.matchesAccount) add(InlinePaymentLinksResourceTransferDataDestinationXc35ed13bBranch.Account)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentLinksResourceTransferDataDestinationXc35ed13b {
      val inspection = inspectInlinePaymentLinksResourceTransferDataDestinationXc35ed13b(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentLinksResourceTransferDataDestinationXc35ed13bNoMatchException("InlinePaymentLinksResourceTransferDataDestinationXc35ed13b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentLinksResourceTransferDataDestinationXc35ed13b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentLinksResourceTransferDataDestinationXc35ed13b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentLinksResourceTransferDataDestinationXc35ed13b {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentLinksResourceTransferDataDestinationXc35ed13b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentLinksResourceTransferDataDestinationXc35ed13b) {
      encoder.requireJsonEncoder("InlinePaymentLinksResourceTransferDataDestinationXc35ed13b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentLinksResourceTransferDataDestinationXc35ed13b(element: JsonElement): InlinePaymentLinksResourceTransferDataDestinationXc35ed13bInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesAccount = element.isJsonDecodable<Account>()
  return InlinePaymentLinksResourceTransferDataDestinationXc35ed13bInspection(
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
