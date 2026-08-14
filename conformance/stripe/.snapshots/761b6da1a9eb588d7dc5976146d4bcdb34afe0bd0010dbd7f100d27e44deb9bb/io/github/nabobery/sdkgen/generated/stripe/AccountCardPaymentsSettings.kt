package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_card_payments_settings
 */
@Serializable(with = AccountCardPaymentsSettings.Serializer::class)
public class AccountCardPaymentsSettings(
  public val declineOn: AccountDeclineChargeOn? = null,
  /**
   * The default text that appears on credit card statements when a charge is made. This field prefixes any dynamic
   * `statement_descriptor` specified on the charge. `statement_descriptor_prefix` is useful for maximizing descriptor
   * space for the dynamic portion.
   */
  public val statementDescriptorPrefix: String? = null,
  /**
   * The Kana variation of the default text that appears on credit card statements when a charge is made (Japan only).
   * This field prefixes any dynamic `statement_descriptor_suffix_kana` specified on the charge.
   * `statement_descriptor_prefix_kana` is useful for maximizing descriptor space for the dynamic portion.
   */
  public val statementDescriptorPrefixKana: String? = null,
  /**
   * The Kanji variation of the default text that appears on credit card statements when a charge is made (Japan only).
   * This field prefixes any dynamic `statement_descriptor_suffix_kanji` specified on the charge.
   * `statement_descriptor_prefix_kanji` is useful for maximizing descriptor space for the dynamic portion.
   */
  public val statementDescriptorPrefixKanji: String? = null,
) {
  public class Builder {
    public var declineOn: AccountDeclineChargeOn? = null

    /**
     * The default text that appears on credit card statements when a charge is made. This field prefixes any dynamic
     * `statement_descriptor` specified on the charge. `statement_descriptor_prefix` is useful for maximizing descriptor
     * space for the dynamic portion.
     */
    public var statementDescriptorPrefix: String? = null

    /**
     * The Kana variation of the default text that appears on credit card statements when a charge is made (Japan only).
     * This field prefixes any dynamic `statement_descriptor_suffix_kana` specified on the charge.
     * `statement_descriptor_prefix_kana` is useful for maximizing descriptor space for the dynamic portion.
     */
    public var statementDescriptorPrefixKana: String? = null

    /**
     * The Kanji variation of the default text that appears on credit card statements when a charge is made (Japan
     * only). This field prefixes any dynamic `statement_descriptor_suffix_kanji` specified on the charge.
     * `statement_descriptor_prefix_kanji` is useful for maximizing descriptor space for the dynamic portion.
     */
    public var statementDescriptorPrefixKanji: String? = null

    public fun build(): AccountCardPaymentsSettings = AccountCardPaymentsSettings(
      declineOn = declineOn,
      statementDescriptorPrefix = statementDescriptorPrefix,
      statementDescriptorPrefixKana = statementDescriptorPrefixKana,
      statementDescriptorPrefixKanji = statementDescriptorPrefixKanji,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AccountCardPaymentsSettings = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AccountCardPaymentsSettings> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AccountCardPaymentsSettings {
      val jsonDecoder = decoder.requireJsonDecoder("AccountCardPaymentsSettings")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AccountCardPaymentsSettings must be a JSON object")
      return AccountCardPaymentsSettings(
        declineOn = rawObject["decline_on"]?.let { json.decodeFromJsonElement<AccountDeclineChargeOn>(it) },
        statementDescriptorPrefix = rawObject["statement_descriptor_prefix"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        statementDescriptorPrefixKana = rawObject["statement_descriptor_prefix_kana"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        statementDescriptorPrefixKanji = rawObject["statement_descriptor_prefix_kanji"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AccountCardPaymentsSettings) {
      val jsonEncoder = encoder.requireJsonEncoder("AccountCardPaymentsSettings")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.declineOn?.let { put("decline_on", json.encodeToJsonElement(it)) }
        value.statementDescriptorPrefix?.let { put("statement_descriptor_prefix", it) }
        value.statementDescriptorPrefixKana?.let { put("statement_descriptor_prefix_kana", it) }
        value.statementDescriptorPrefixKanji?.let { put("statement_descriptor_prefix_kanji", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun accountCardPaymentsSettings(block: AccountCardPaymentsSettings.Builder.() -> Unit): AccountCardPaymentsSettings = AccountCardPaymentsSettings.build(block)
