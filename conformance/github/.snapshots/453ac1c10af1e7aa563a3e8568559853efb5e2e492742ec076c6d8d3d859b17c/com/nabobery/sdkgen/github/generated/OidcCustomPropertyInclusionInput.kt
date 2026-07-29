package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.put

/**
 * Input for creating an OIDC custom property inclusion
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/oidc-custom-property-inclusion-input
 */
@Serializable(with = OidcCustomPropertyInclusionInput.Serializer::class)
public class OidcCustomPropertyInclusionInput(
  /**
   * The name of the custom property to include in the OIDC token
   */
  public val customPropertyName: String,
) {
  public class Builder {
    private var customPropertyNameValue: String? = null

    public var customPropertyName: String
      get() = requireNotNull(customPropertyNameValue) { "customPropertyName is required" }
      set(`value`) {
        customPropertyNameValue = value
      }

    public fun build(): OidcCustomPropertyInclusionInput {
      check(customPropertyNameValue != null) { "customPropertyName is required" }
      return OidcCustomPropertyInclusionInput(
        customPropertyName = customPropertyName,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OidcCustomPropertyInclusionInput = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<OidcCustomPropertyInclusionInput> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OidcCustomPropertyInclusionInput {
      val jsonDecoder = decoder.requireJsonDecoder("OidcCustomPropertyInclusionInput")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OidcCustomPropertyInclusionInput must be a JSON object")
      val customPropertyName = json.decodeRequired<String>(rawObject, "custom_property_name")
      return OidcCustomPropertyInclusionInput(
        customPropertyName = customPropertyName,
      )
    }

    override fun serialize(encoder: Encoder, `value`: OidcCustomPropertyInclusionInput) {
      val jsonEncoder = encoder.requireJsonEncoder("OidcCustomPropertyInclusionInput")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("custom_property_name", value.customPropertyName)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun oidcCustomPropertyInclusionInput(block: OidcCustomPropertyInclusionInput.Builder.() -> Unit): OidcCustomPropertyInclusionInput = OidcCustomPropertyInclusionInput.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OidcCustomPropertyInclusionInput is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
