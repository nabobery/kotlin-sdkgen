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

public enum class InlineConnectCollectionTransferDestinationX80ef6bc4Branch {
  Branch1,
  Account,
}

public sealed class InlineConnectCollectionTransferDestinationX80ef6bc4DecodingException(
  message: String,
) : SerializationException(message)

public class InlineConnectCollectionTransferDestinationX80ef6bc4NoMatchException(
  message: String,
) : InlineConnectCollectionTransferDestinationX80ef6bc4DecodingException(message)

internal data class InlineConnectCollectionTransferDestinationX80ef6bc4Inspection(
  public val matchesBranch1: Boolean,
  public val matchesAccount: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesAccount).count { it }
}

/**
 * ID of the account that funds are being collected for.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/connect_collection_transfer/properties/destination
 */
@Serializable(with = InlineConnectCollectionTransferDestinationX80ef6bc4.Serializer::class)
public class InlineConnectCollectionTransferDestinationX80ef6bc4 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineConnectCollectionTransferDestinationX80ef6bc4Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val account: Account? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAccount) json.decodeFromJsonElement<Account>(raw) else null }

  public val matchedBranches: Set<InlineConnectCollectionTransferDestinationX80ef6bc4Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineConnectCollectionTransferDestinationX80ef6bc4Branch.Branch1)
      if (inspection.matchesAccount) add(InlineConnectCollectionTransferDestinationX80ef6bc4Branch.Account)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineConnectCollectionTransferDestinationX80ef6bc4 {
      val inspection = inspectInlineConnectCollectionTransferDestinationX80ef6bc4(raw)
      if (inspection.matchCount == 0) {
        throw InlineConnectCollectionTransferDestinationX80ef6bc4NoMatchException("InlineConnectCollectionTransferDestinationX80ef6bc4 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineConnectCollectionTransferDestinationX80ef6bc4(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineConnectCollectionTransferDestinationX80ef6bc4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineConnectCollectionTransferDestinationX80ef6bc4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineConnectCollectionTransferDestinationX80ef6bc4")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineConnectCollectionTransferDestinationX80ef6bc4) {
      encoder.requireJsonEncoder("InlineConnectCollectionTransferDestinationX80ef6bc4").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineConnectCollectionTransferDestinationX80ef6bc4(element: JsonElement): InlineConnectCollectionTransferDestinationX80ef6bc4Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesAccount = element.isJsonDecodable<Account>()
  return InlineConnectCollectionTransferDestinationX80ef6bc4Inspection(
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
