package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * Feature options for code scanning
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-security-configuration/properties/code_scanning_options
 */
@Serializable(with = InlineCodeSecurityConfigurationCodeScanningOptionsXc0a882e6.Serializer::class)
public class InlineCodeSecurityConfigurationCodeScanningOptionsXc0a882e6(
  /**
   * Whether to allow repos which use advanced setup
   */
  public val allowAdvanced: Boolean? = null,
) {
  public class Builder {
    /**
     * Whether to allow repos which use advanced setup
     */
    public var allowAdvanced: Boolean? = null

    public fun build(): InlineCodeSecurityConfigurationCodeScanningOptionsXc0a882e6 = InlineCodeSecurityConfigurationCodeScanningOptionsXc0a882e6(
      allowAdvanced = allowAdvanced,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCodeSecurityConfigurationCodeScanningOptionsXc0a882e6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineCodeSecurityConfigurationCodeScanningOptionsXc0a882e6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCodeSecurityConfigurationCodeScanningOptionsXc0a882e6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCodeSecurityConfigurationCodeScanningOptionsXc0a882e6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCodeSecurityConfigurationCodeScanningOptionsXc0a882e6 must be a JSON object")
      return InlineCodeSecurityConfigurationCodeScanningOptionsXc0a882e6(
        allowAdvanced = rawObject["allow_advanced"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCodeSecurityConfigurationCodeScanningOptionsXc0a882e6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCodeSecurityConfigurationCodeScanningOptionsXc0a882e6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.allowAdvanced?.let { put("allow_advanced", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCodeSecurityConfigurationCodeScanningOptionsXc0a882e6(block: InlineCodeSecurityConfigurationCodeScanningOptionsXc0a882e6.Builder.() -> Unit): InlineCodeSecurityConfigurationCodeScanningOptionsXc0a882e6 = InlineCodeSecurityConfigurationCodeScanningOptionsXc0a882e6.build(block)
