package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/branch-protection/properties/required_signatures.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/branch-protection/properties/required_signatures
 */
@Serializable(with = InlineBranchProtectionRequiredSignaturesX87f22270.Serializer::class)
public class InlineBranchProtectionRequiredSignaturesX87f22270(
  public val enabled: Boolean,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): InlineBranchProtectionRequiredSignaturesX87f22270 {
      check(enabledValue != null) { "enabled is required" }
      check(urlValue != null) { "url is required" }
      return InlineBranchProtectionRequiredSignaturesX87f22270(
        enabled = enabled,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineBranchProtectionRequiredSignaturesX87f22270 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineBranchProtectionRequiredSignaturesX87f22270> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBranchProtectionRequiredSignaturesX87f22270 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBranchProtectionRequiredSignaturesX87f22270")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineBranchProtectionRequiredSignaturesX87f22270 must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineBranchProtectionRequiredSignaturesX87f22270(
        enabled = enabled,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineBranchProtectionRequiredSignaturesX87f22270) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineBranchProtectionRequiredSignaturesX87f22270")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineBranchProtectionRequiredSignaturesX87f22270(block: InlineBranchProtectionRequiredSignaturesX87f22270.Builder.() -> Unit): InlineBranchProtectionRequiredSignaturesX87f22270 = InlineBranchProtectionRequiredSignaturesX87f22270.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineBranchProtectionRequiredSignaturesX87f22270 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
