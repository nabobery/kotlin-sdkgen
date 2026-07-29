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

public enum class InlineInvoiceSettingSubscriptionSchedulePhaseSettingIssuerXd22bd65cBranch {
  ConnectAccountReference,
}

public sealed class InlineInvoiceSettingSubscriptionSchedulePhaseSettingIssuerXd22bd65cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineInvoiceSettingSubscriptionSchedulePhaseSettingIssuerXd22bd65cNoMatchException(
  message: String,
) : InlineInvoiceSettingSubscriptionSchedulePhaseSettingIssuerXd22bd65cDecodingException(message)

internal data class InlineInvoiceSettingSubscriptionSchedulePhaseSettingIssuerXd22bd65cInspection(
  public val matchesConnectAccountReference: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesConnectAccountReference).count { it }
}

/**
 * The connected account that issues the invoice. The invoice is presented with the branding and support information of
 * the specified account.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/invoice_setting_subscription_schedule_phase_setting/properties/issue
 * r
 */
@Serializable(with = InlineInvoiceSettingSubscriptionSchedulePhaseSettingIssuerXd22bd65c.Serializer::class)
public class InlineInvoiceSettingSubscriptionSchedulePhaseSettingIssuerXd22bd65c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineInvoiceSettingSubscriptionSchedulePhaseSettingIssuerXd22bd65cInspection,
) {
  public val connectAccountReference: ConnectAccountReferenceView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesConnectAccountReference) json.decodeFromJsonElement<ConnectAccountReferenceView>(raw) else null }

  public val matchedBranches:
      Set<InlineInvoiceSettingSubscriptionSchedulePhaseSettingIssuerXd22bd65cBranch>
    get() = buildSet {
      if (inspection.matchesConnectAccountReference) add(InlineInvoiceSettingSubscriptionSchedulePhaseSettingIssuerXd22bd65cBranch.ConnectAccountReference)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInvoiceSettingSubscriptionSchedulePhaseSettingIssuerXd22bd65c {
      val inspection = inspectInlineInvoiceSettingSubscriptionSchedulePhaseSettingIssuerXd22bd65c(raw)
      if (inspection.matchCount == 0) {
        throw InlineInvoiceSettingSubscriptionSchedulePhaseSettingIssuerXd22bd65cNoMatchException("InlineInvoiceSettingSubscriptionSchedulePhaseSettingIssuerXd22bd65c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInvoiceSettingSubscriptionSchedulePhaseSettingIssuerXd22bd65c(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineInvoiceSettingSubscriptionSchedulePhaseSettingIssuerXd22bd65c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoiceSettingSubscriptionSchedulePhaseSettingIssuerXd22bd65c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoiceSettingSubscriptionSchedulePhaseSettingIssuerXd22bd65c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoiceSettingSubscriptionSchedulePhaseSettingIssuerXd22bd65c) {
      encoder.requireJsonEncoder("InlineInvoiceSettingSubscriptionSchedulePhaseSettingIssuerXd22bd65c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInvoiceSettingSubscriptionSchedulePhaseSettingIssuerXd22bd65c(element: JsonElement): InlineInvoiceSettingSubscriptionSchedulePhaseSettingIssuerXd22bd65cInspection {
  val raw = element as? JsonObject ?: return InlineInvoiceSettingSubscriptionSchedulePhaseSettingIssuerXd22bd65cInspection(
    matchesConnectAccountReference = false,
    failures = listOf("ConnectAccountReference: expected JSON object"),
  )
  val matchesConnectAccountReference = raw["type"] != null
  return InlineInvoiceSettingSubscriptionSchedulePhaseSettingIssuerXd22bd65cInspection(
    matchesConnectAccountReference = matchesConnectAccountReference,
    failures = buildList {
      if (!matchesConnectAccountReference) add("ConnectAccountReference: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
