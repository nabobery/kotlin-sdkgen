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

public enum class InlineSetupIntentOnBehalfOfX6d54b25dBranch {
  Branch1,
  Account,
}

public sealed class InlineSetupIntentOnBehalfOfX6d54b25dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineSetupIntentOnBehalfOfX6d54b25dNoMatchException(
  message: String,
) : InlineSetupIntentOnBehalfOfX6d54b25dDecodingException(message)

internal data class InlineSetupIntentOnBehalfOfX6d54b25dInspection(
  public val matchesBranch1: Boolean,
  public val matchesAccount: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesAccount).count { it }
}

/**
 * The account (if any) for which the setup is intended.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent/properties/on_behalf_of
 */
@Serializable(with = InlineSetupIntentOnBehalfOfX6d54b25d.Serializer::class)
public class InlineSetupIntentOnBehalfOfX6d54b25d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSetupIntentOnBehalfOfX6d54b25dInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val account: Account? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAccount) json.decodeFromJsonElement<Account>(raw) else null }

  public val matchedBranches: Set<InlineSetupIntentOnBehalfOfX6d54b25dBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineSetupIntentOnBehalfOfX6d54b25dBranch.Branch1)
      if (inspection.matchesAccount) add(InlineSetupIntentOnBehalfOfX6d54b25dBranch.Account)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSetupIntentOnBehalfOfX6d54b25d {
      val inspection = inspectInlineSetupIntentOnBehalfOfX6d54b25d(raw)
      if (inspection.matchCount == 0) {
        throw InlineSetupIntentOnBehalfOfX6d54b25dNoMatchException("InlineSetupIntentOnBehalfOfX6d54b25d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSetupIntentOnBehalfOfX6d54b25d(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineSetupIntentOnBehalfOfX6d54b25d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSetupIntentOnBehalfOfX6d54b25d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSetupIntentOnBehalfOfX6d54b25d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSetupIntentOnBehalfOfX6d54b25d) {
      encoder.requireJsonEncoder("InlineSetupIntentOnBehalfOfX6d54b25d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSetupIntentOnBehalfOfX6d54b25d(element: JsonElement): InlineSetupIntentOnBehalfOfX6d54b25dInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesAccount = element.isJsonDecodable<Account>()
  return InlineSetupIntentOnBehalfOfX6d54b25dInspection(
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
