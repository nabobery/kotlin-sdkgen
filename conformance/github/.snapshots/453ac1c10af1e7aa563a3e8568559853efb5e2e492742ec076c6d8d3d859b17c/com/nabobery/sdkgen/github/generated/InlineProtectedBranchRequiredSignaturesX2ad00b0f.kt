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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/protected-branch/properties/required_signatures.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/protected-branch/properties/required_signatures
 */
@Serializable(with = InlineProtectedBranchRequiredSignaturesX2ad00b0f.Serializer::class)
public class InlineProtectedBranchRequiredSignaturesX2ad00b0f(
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

    public fun build(): InlineProtectedBranchRequiredSignaturesX2ad00b0f {
      check(enabledValue != null) { "enabled is required" }
      check(urlValue != null) { "url is required" }
      return InlineProtectedBranchRequiredSignaturesX2ad00b0f(
        enabled = enabled,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineProtectedBranchRequiredSignaturesX2ad00b0f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineProtectedBranchRequiredSignaturesX2ad00b0f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineProtectedBranchRequiredSignaturesX2ad00b0f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineProtectedBranchRequiredSignaturesX2ad00b0f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineProtectedBranchRequiredSignaturesX2ad00b0f must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineProtectedBranchRequiredSignaturesX2ad00b0f(
        enabled = enabled,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineProtectedBranchRequiredSignaturesX2ad00b0f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineProtectedBranchRequiredSignaturesX2ad00b0f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineProtectedBranchRequiredSignaturesX2ad00b0f(block: InlineProtectedBranchRequiredSignaturesX2ad00b0f.Builder.() -> Unit): InlineProtectedBranchRequiredSignaturesX2ad00b0f = InlineProtectedBranchRequiredSignaturesX2ad00b0f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineProtectedBranchRequiredSignaturesX2ad00b0f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
