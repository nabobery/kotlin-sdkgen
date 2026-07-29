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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineAccountSettingsX8aa98c30Branch {
  AccountSettings,
}

public sealed class InlineAccountSettingsX8aa98c30DecodingException(
  message: String,
) : SerializationException(message)

public class InlineAccountSettingsX8aa98c30NoMatchException(
  message: String,
) : InlineAccountSettingsX8aa98c30DecodingException(message)

internal data class InlineAccountSettingsX8aa98c30Inspection(
  public val matchesAccountSettings: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesAccountSettings).count { it }
}

/**
 * Options for customizing how the account functions within Stripe.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account/properties/settings
 */
@Serializable(with = InlineAccountSettingsX8aa98c30.Serializer::class)
public class InlineAccountSettingsX8aa98c30 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineAccountSettingsX8aa98c30Inspection,
) {
  public val accountSettings: AccountSettingsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAccountSettings) json.decodeFromJsonElement<AccountSettingsView>(raw) else null }

  public val matchedBranches: Set<InlineAccountSettingsX8aa98c30Branch>
    get() = buildSet {
      if (inspection.matchesAccountSettings) add(InlineAccountSettingsX8aa98c30Branch.AccountSettings)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineAccountSettingsX8aa98c30 {
      val inspection = inspectInlineAccountSettingsX8aa98c30(raw)
      if (inspection.matchCount == 0) {
        throw InlineAccountSettingsX8aa98c30NoMatchException("InlineAccountSettingsX8aa98c30 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineAccountSettingsX8aa98c30(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineAccountSettingsX8aa98c30> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAccountSettingsX8aa98c30 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAccountSettingsX8aa98c30")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineAccountSettingsX8aa98c30) {
      encoder.requireJsonEncoder("InlineAccountSettingsX8aa98c30").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineAccountSettingsX8aa98c30(element: JsonElement): InlineAccountSettingsX8aa98c30Inspection {
  val raw = element as? JsonObject ?: return InlineAccountSettingsX8aa98c30Inspection(
    matchesAccountSettings = false,
    failures = listOf("AccountSettings: expected JSON object"),
  )
  val matchesAccountSettings = raw["branding"] != null && raw["card_payments"] != null && raw["dashboard"] != null && raw["payments"] != null
  return InlineAccountSettingsX8aa98c30Inspection(
    matchesAccountSettings = matchesAccountSettings,
    failures = buildList {
      if (!matchesAccountSettings) add("AccountSettings: required properties 'branding', 'card_payments', 'dashboard', 'payments' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
