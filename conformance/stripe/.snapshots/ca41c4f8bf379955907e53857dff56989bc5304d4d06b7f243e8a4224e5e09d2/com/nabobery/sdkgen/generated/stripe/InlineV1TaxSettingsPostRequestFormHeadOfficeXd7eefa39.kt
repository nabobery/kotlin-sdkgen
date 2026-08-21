package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * The place where your business is located.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1settings/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/head_office
 */
@Serializable(with = InlineV1TaxSettingsPostRequestFormHeadOfficeXd7eefa39.Serializer::class)
public class InlineV1TaxSettingsPostRequestFormHeadOfficeXd7eefa39(
  public val address: InlineV1TaxSettingsPostRequestFormHeadOfficeAddressXd0a4442d,
) {
  public class Builder {
    private var addressValue: InlineV1TaxSettingsPostRequestFormHeadOfficeAddressXd0a4442d? = null

    public var address: InlineV1TaxSettingsPostRequestFormHeadOfficeAddressXd0a4442d
      get() = requireNotNull(addressValue) { "address is required" }
      set(`value`) {
        addressValue = value
      }

    public fun build(): InlineV1TaxSettingsPostRequestFormHeadOfficeXd7eefa39 {
      check(addressValue != null) { "address is required" }
      return InlineV1TaxSettingsPostRequestFormHeadOfficeXd7eefa39(
        address = address,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxSettingsPostRequestFormHeadOfficeXd7eefa39 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxSettingsPostRequestFormHeadOfficeXd7eefa39> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxSettingsPostRequestFormHeadOfficeXd7eefa39 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxSettingsPostRequestFormHeadOfficeXd7eefa39")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxSettingsPostRequestFormHeadOfficeXd7eefa39 must be a JSON object")
      val address = json.decodeRequired<InlineV1TaxSettingsPostRequestFormHeadOfficeAddressXd0a4442d>(rawObject, "address")
      return InlineV1TaxSettingsPostRequestFormHeadOfficeXd7eefa39(
        address = address,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxSettingsPostRequestFormHeadOfficeXd7eefa39) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxSettingsPostRequestFormHeadOfficeXd7eefa39")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("address", json.encodeToJsonElement(value.address))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxSettingsPostRequestFormHeadOfficeXd7eefa39(block: InlineV1TaxSettingsPostRequestFormHeadOfficeXd7eefa39.Builder.() -> Unit): InlineV1TaxSettingsPostRequestFormHeadOfficeXd7eefa39 = InlineV1TaxSettingsPostRequestFormHeadOfficeXd7eefa39.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxSettingsPostRequestFormHeadOfficeXd7eefa39 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
