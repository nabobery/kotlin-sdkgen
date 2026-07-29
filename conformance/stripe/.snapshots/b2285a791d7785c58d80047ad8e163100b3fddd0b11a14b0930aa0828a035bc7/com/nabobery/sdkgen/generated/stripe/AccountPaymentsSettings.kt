package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_payments_settings
 */
@Serializable(with = AccountPaymentsSettings.Serializer::class)
public class AccountPaymentsSettings(
  /**
   * The default text that appears on credit card statements when a charge is made. This field prefixes any dynamic
   * `statement_descriptor` specified on the charge.
   */
  public val statementDescriptor: String? = null,
  /**
   * The Kana variation of `statement_descriptor` used for charges in Japan. Japanese statement descriptors have
   * [special
   * requirements](https://docs.stripe.com/get-started/account/statement-descriptors#set-japanese-statement-descriptors)
   * .
   */
  public val statementDescriptorKana: String? = null,
  /**
   * The Kanji variation of `statement_descriptor` used for charges in Japan. Japanese statement descriptors have
   * [special
   * requirements](https://docs.stripe.com/get-started/account/statement-descriptors#set-japanese-statement-descriptors)
   * .
   */
  public val statementDescriptorKanji: String? = null,
) {
  public class Builder {
    /**
     * The default text that appears on credit card statements when a charge is made. This field prefixes any dynamic
     * `statement_descriptor` specified on the charge.
     */
    public var statementDescriptor: String? = null

    /**
     * The Kana variation of `statement_descriptor` used for charges in Japan. Japanese statement descriptors have
     * [special
     * requirements](https://docs.stripe.com/get-started/account/statement-descriptors#set-japanese-statement-descriptor
     * s).
     */
    public var statementDescriptorKana: String? = null

    /**
     * The Kanji variation of `statement_descriptor` used for charges in Japan. Japanese statement descriptors have
     * [special
     * requirements](https://docs.stripe.com/get-started/account/statement-descriptors#set-japanese-statement-descriptor
     * s).
     */
    public var statementDescriptorKanji: String? = null

    public fun build(): AccountPaymentsSettings = AccountPaymentsSettings(
      statementDescriptor = statementDescriptor,
      statementDescriptorKana = statementDescriptorKana,
      statementDescriptorKanji = statementDescriptorKanji,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AccountPaymentsSettings = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AccountPaymentsSettings> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AccountPaymentsSettings {
      val jsonDecoder = decoder.requireJsonDecoder("AccountPaymentsSettings")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AccountPaymentsSettings must be a JSON object")
      return AccountPaymentsSettings(
        statementDescriptor = rawObject["statement_descriptor"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        statementDescriptorKana = rawObject["statement_descriptor_kana"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        statementDescriptorKanji = rawObject["statement_descriptor_kanji"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AccountPaymentsSettings) {
      val jsonEncoder = encoder.requireJsonEncoder("AccountPaymentsSettings")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.statementDescriptor?.let { put("statement_descriptor", it) }
        value.statementDescriptorKana?.let { put("statement_descriptor_kana", it) }
        value.statementDescriptorKanji?.let { put("statement_descriptor_kanji", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun accountPaymentsSettings(block: AccountPaymentsSettings.Builder.() -> Unit): AccountPaymentsSettings = AccountPaymentsSettings.build(block)
