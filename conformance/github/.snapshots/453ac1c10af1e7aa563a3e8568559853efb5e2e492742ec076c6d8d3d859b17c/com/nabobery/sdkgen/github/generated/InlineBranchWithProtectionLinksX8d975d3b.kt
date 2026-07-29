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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/branch-with-protection/properties/_links.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/branch-with-protection/properties/_links
 */
@Serializable(with = InlineBranchWithProtectionLinksX8d975d3b.Serializer::class)
public class InlineBranchWithProtectionLinksX8d975d3b(
  public val html: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val self: String,
) {
  public class Builder {
    private var htmlValue: String? = null

    public var html: String
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var selfValue: String? = null

    public var self: String
      get() = requireNotNull(selfValue) { "self is required" }
      set(`value`) {
        selfValue = value
      }

    public fun build(): InlineBranchWithProtectionLinksX8d975d3b {
      check(htmlValue != null) { "html is required" }
      check(selfValue != null) { "self is required" }
      return InlineBranchWithProtectionLinksX8d975d3b(
        html = html,
        self = self,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineBranchWithProtectionLinksX8d975d3b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineBranchWithProtectionLinksX8d975d3b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBranchWithProtectionLinksX8d975d3b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBranchWithProtectionLinksX8d975d3b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineBranchWithProtectionLinksX8d975d3b must be a JSON object")
      val html = json.decodeRequired<String>(rawObject, "html")
      val self = json.decodeRequired<String>(rawObject, "self")
      return InlineBranchWithProtectionLinksX8d975d3b(
        html = html,
        self = self,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineBranchWithProtectionLinksX8d975d3b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineBranchWithProtectionLinksX8d975d3b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("html", value.html)
        put("self", value.self)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineBranchWithProtectionLinksX8d975d3b(block: InlineBranchWithProtectionLinksX8d975d3b.Builder.() -> Unit): InlineBranchWithProtectionLinksX8d975d3b = InlineBranchWithProtectionLinksX8d975d3b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineBranchWithProtectionLinksX8d975d3b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
