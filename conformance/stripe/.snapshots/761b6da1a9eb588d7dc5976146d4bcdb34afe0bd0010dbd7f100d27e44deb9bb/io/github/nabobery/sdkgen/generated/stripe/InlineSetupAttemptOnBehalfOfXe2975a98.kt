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

public enum class InlineSetupAttemptOnBehalfOfXe2975a98Branch {
  Branch1,
  Account,
}

public sealed class InlineSetupAttemptOnBehalfOfXe2975a98DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSetupAttemptOnBehalfOfXe2975a98NoMatchException(
  message: String,
) : InlineSetupAttemptOnBehalfOfXe2975a98DecodingException(message)

internal data class InlineSetupAttemptOnBehalfOfXe2975a98Inspection(
  public val matchesBranch1: Boolean,
  public val matchesAccount: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesAccount).count { it }
}

/**
 * The value of [on_behalf_of](https://docs.stripe.com/api/setup_intents/object#setup_intent_object-on_behalf_of) on the
 * SetupIntent at the time of this confirmation.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_attempt/properties/on_behalf_of
 */
@Serializable(with = InlineSetupAttemptOnBehalfOfXe2975a98.Serializer::class)
public class InlineSetupAttemptOnBehalfOfXe2975a98 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSetupAttemptOnBehalfOfXe2975a98Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val account: Account? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAccount) json.decodeFromJsonElement<Account>(raw) else null }

  public val matchedBranches: Set<InlineSetupAttemptOnBehalfOfXe2975a98Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineSetupAttemptOnBehalfOfXe2975a98Branch.Branch1)
      if (inspection.matchesAccount) add(InlineSetupAttemptOnBehalfOfXe2975a98Branch.Account)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSetupAttemptOnBehalfOfXe2975a98 {
      val inspection = inspectInlineSetupAttemptOnBehalfOfXe2975a98(raw)
      if (inspection.matchCount == 0) {
        throw InlineSetupAttemptOnBehalfOfXe2975a98NoMatchException("InlineSetupAttemptOnBehalfOfXe2975a98 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSetupAttemptOnBehalfOfXe2975a98(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSetupAttemptOnBehalfOfXe2975a98> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSetupAttemptOnBehalfOfXe2975a98 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSetupAttemptOnBehalfOfXe2975a98")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSetupAttemptOnBehalfOfXe2975a98) {
      encoder.requireJsonEncoder("InlineSetupAttemptOnBehalfOfXe2975a98").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSetupAttemptOnBehalfOfXe2975a98(element: JsonElement): InlineSetupAttemptOnBehalfOfXe2975a98Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesAccount = element.isJsonDecodable<Account>()
  return InlineSetupAttemptOnBehalfOfXe2975a98Inspection(
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
