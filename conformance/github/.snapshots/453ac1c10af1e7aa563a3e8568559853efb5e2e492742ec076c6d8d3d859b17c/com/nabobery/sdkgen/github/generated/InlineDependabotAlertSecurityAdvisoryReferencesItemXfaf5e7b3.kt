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
 * A link to additional advisory information.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/dependabot-alert-security-advisory/properties/references/items
 */
@Serializable(with = InlineDependabotAlertSecurityAdvisoryReferencesItemXfaf5e7b3.Serializer::class)
public class InlineDependabotAlertSecurityAdvisoryReferencesItemXfaf5e7b3(
  /**
   * The URL of the reference.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
) {
  public class Builder {
    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): InlineDependabotAlertSecurityAdvisoryReferencesItemXfaf5e7b3 {
      check(urlValue != null) { "url is required" }
      return InlineDependabotAlertSecurityAdvisoryReferencesItemXfaf5e7b3(
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineDependabotAlertSecurityAdvisoryReferencesItemXfaf5e7b3 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineDependabotAlertSecurityAdvisoryReferencesItemXfaf5e7b3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineDependabotAlertSecurityAdvisoryReferencesItemXfaf5e7b3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineDependabotAlertSecurityAdvisoryReferencesItemXfaf5e7b3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineDependabotAlertSecurityAdvisoryReferencesItemXfaf5e7b3 must be a JSON object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineDependabotAlertSecurityAdvisoryReferencesItemXfaf5e7b3(
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineDependabotAlertSecurityAdvisoryReferencesItemXfaf5e7b3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineDependabotAlertSecurityAdvisoryReferencesItemXfaf5e7b3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineDependabotAlertSecurityAdvisoryReferencesItemXfaf5e7b3(block: InlineDependabotAlertSecurityAdvisoryReferencesItemXfaf5e7b3.Builder.() -> Unit): InlineDependabotAlertSecurityAdvisoryReferencesItemXfaf5e7b3 = InlineDependabotAlertSecurityAdvisoryReferencesItemXfaf5e7b3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineDependabotAlertSecurityAdvisoryReferencesItemXfaf5e7b3 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
