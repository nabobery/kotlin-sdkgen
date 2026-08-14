package io.github.nabobery.sdkgen.github.generated

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
 * An OIDC custom property inclusion for repository properties
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/oidc-custom-property-inclusion
 */
@Serializable(with = OidcCustomPropertyInclusion.Serializer::class)
public class OidcCustomPropertyInclusion(
  /**
   * The name of the custom property that is included in the OIDC token
   */
  public val customPropertyName: String,
  /**
   * Whether the inclusion was defined at the organization or enterprise level
   */
  public val inclusionSource: InlineOidcCustomPropertyInclusionInclusionSourceX2b4e3ace,
) {
  public class Builder {
    private var customPropertyNameValue: String? = null

    public var customPropertyName: String
      get() = requireNotNull(customPropertyNameValue) { "customPropertyName is required" }
      set(`value`) {
        customPropertyNameValue = value
      }

    private var inclusionSourceValue: InlineOidcCustomPropertyInclusionInclusionSourceX2b4e3ace? =
        null

    public var inclusionSource: InlineOidcCustomPropertyInclusionInclusionSourceX2b4e3ace
      get() = requireNotNull(inclusionSourceValue) { "inclusionSource is required" }
      set(`value`) {
        inclusionSourceValue = value
      }

    public fun build(): OidcCustomPropertyInclusion {
      check(customPropertyNameValue != null) { "customPropertyName is required" }
      check(inclusionSourceValue != null) { "inclusionSource is required" }
      return OidcCustomPropertyInclusion(
        customPropertyName = customPropertyName,
        inclusionSource = inclusionSource,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OidcCustomPropertyInclusion = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OidcCustomPropertyInclusion> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OidcCustomPropertyInclusion {
      val jsonDecoder = decoder.requireJsonDecoder("OidcCustomPropertyInclusion")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OidcCustomPropertyInclusion must be a JSON object")
      val customPropertyName = json.decodeRequired<String>(rawObject, "custom_property_name")
      val inclusionSource = json.decodeRequired<InlineOidcCustomPropertyInclusionInclusionSourceX2b4e3ace>(rawObject, "inclusion_source")
      return OidcCustomPropertyInclusion(
        customPropertyName = customPropertyName,
        inclusionSource = inclusionSource,
      )
    }

    override fun serialize(encoder: Encoder, `value`: OidcCustomPropertyInclusion) {
      val jsonEncoder = encoder.requireJsonEncoder("OidcCustomPropertyInclusion")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("custom_property_name", value.customPropertyName)
        put("inclusion_source", json.encodeToJsonElement(value.inclusionSource))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun oidcCustomPropertyInclusion(block: OidcCustomPropertyInclusion.Builder.() -> Unit): OidcCustomPropertyInclusion = OidcCustomPropertyInclusion.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OidcCustomPropertyInclusion is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
