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

public enum class InlineSubscriptionSchedulesResourceDefaultSettingsOnBehalfOfXca035d5aBranch {
  Branch1,
  Account,
}

public sealed class InlineSubscriptionSchedulesResourceDefaultSettingsOnBehalfOfXca035d5aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionSchedulesResourceDefaultSettingsOnBehalfOfXca035d5aNoMatchException(
  message: String,
) : InlineSubscriptionSchedulesResourceDefaultSettingsOnBehalfOfXca035d5aDecodingException(message)

internal data class InlineSubscriptionSchedulesResourceDefaultSettingsOnBehalfOfXca035d5aInspection(
  public val matchesBranch1: Boolean,
  public val matchesAccount: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesAccount).count { it }
}

/**
 * The account (if any) the charge was made on behalf of for charges associated with the schedule's subscription. See
 * the Connect documentation for details.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscription_schedules_resource_default_settings/properties/on_behal
 * f_of
 */
@Serializable(with = InlineSubscriptionSchedulesResourceDefaultSettingsOnBehalfOfXca035d5a.Serializer::class)
public class InlineSubscriptionSchedulesResourceDefaultSettingsOnBehalfOfXca035d5a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineSubscriptionSchedulesResourceDefaultSettingsOnBehalfOfXca035d5aInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val account: Account? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAccount) json.decodeFromJsonElement<Account>(raw) else null }

  public val matchedBranches:
      Set<InlineSubscriptionSchedulesResourceDefaultSettingsOnBehalfOfXca035d5aBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineSubscriptionSchedulesResourceDefaultSettingsOnBehalfOfXca035d5aBranch.Branch1)
      if (inspection.matchesAccount) add(InlineSubscriptionSchedulesResourceDefaultSettingsOnBehalfOfXca035d5aBranch.Account)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionSchedulesResourceDefaultSettingsOnBehalfOfXca035d5a {
      val inspection = inspectInlineSubscriptionSchedulesResourceDefaultSettingsOnBehalfOfXca035d5a(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionSchedulesResourceDefaultSettingsOnBehalfOfXca035d5aNoMatchException("InlineSubscriptionSchedulesResourceDefaultSettingsOnBehalfOfXca035d5a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionSchedulesResourceDefaultSettingsOnBehalfOfXca035d5a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionSchedulesResourceDefaultSettingsOnBehalfOfXca035d5a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionSchedulesResourceDefaultSettingsOnBehalfOfXca035d5a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionSchedulesResourceDefaultSettingsOnBehalfOfXca035d5a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionSchedulesResourceDefaultSettingsOnBehalfOfXca035d5a) {
      encoder.requireJsonEncoder("InlineSubscriptionSchedulesResourceDefaultSettingsOnBehalfOfXca035d5a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionSchedulesResourceDefaultSettingsOnBehalfOfXca035d5a(element: JsonElement): InlineSubscriptionSchedulesResourceDefaultSettingsOnBehalfOfXca035d5aInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesAccount = element.isJsonDecodable<Account>()
  return InlineSubscriptionSchedulesResourceDefaultSettingsOnBehalfOfXca035d5aInspection(
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
