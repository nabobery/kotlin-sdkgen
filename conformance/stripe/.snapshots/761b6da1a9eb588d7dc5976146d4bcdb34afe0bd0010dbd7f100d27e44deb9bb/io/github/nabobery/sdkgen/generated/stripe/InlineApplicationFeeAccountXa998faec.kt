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

public enum class InlineApplicationFeeAccountXa998faecBranch {
  Branch1,
  Account,
}

public sealed class InlineApplicationFeeAccountXa998faecDecodingException(
  message: String,
) : SerializationException(message)

public class InlineApplicationFeeAccountXa998faecNoMatchException(
  message: String,
) : InlineApplicationFeeAccountXa998faecDecodingException(message)

internal data class InlineApplicationFeeAccountXa998faecInspection(
  public val matchesBranch1: Boolean,
  public val matchesAccount: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesAccount).count { it }
}

/**
 * ID of the Stripe account this fee was taken from.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/application_fee/properties/account
 */
@Serializable(with = InlineApplicationFeeAccountXa998faec.Serializer::class)
public class InlineApplicationFeeAccountXa998faec internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineApplicationFeeAccountXa998faecInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val account: Account? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAccount) json.decodeFromJsonElement<Account>(raw) else null }

  public val matchedBranches: Set<InlineApplicationFeeAccountXa998faecBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineApplicationFeeAccountXa998faecBranch.Branch1)
      if (inspection.matchesAccount) add(InlineApplicationFeeAccountXa998faecBranch.Account)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineApplicationFeeAccountXa998faec {
      val inspection = inspectInlineApplicationFeeAccountXa998faec(raw)
      if (inspection.matchCount == 0) {
        throw InlineApplicationFeeAccountXa998faecNoMatchException("InlineApplicationFeeAccountXa998faec matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineApplicationFeeAccountXa998faec(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineApplicationFeeAccountXa998faec> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineApplicationFeeAccountXa998faec {
      val jsonDecoder = decoder.requireJsonDecoder("InlineApplicationFeeAccountXa998faec")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineApplicationFeeAccountXa998faec) {
      encoder.requireJsonEncoder("InlineApplicationFeeAccountXa998faec").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineApplicationFeeAccountXa998faec(element: JsonElement): InlineApplicationFeeAccountXa998faecInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesAccount = element.isJsonDecodable<Account>()
  return InlineApplicationFeeAccountXa998faecInspection(
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
