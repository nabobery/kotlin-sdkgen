package com.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/minimal-repository/properties/license.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/minimal-repository/properties/license
 */
@Serializable(with = InlineMinimalRepositoryLicenseX5778c2e1.Serializer::class)
public class InlineMinimalRepositoryLicenseX5778c2e1(
  public val key: String? = null,
  public val name: String? = null,
  public val nodeId: String? = null,
  public val spdxId: String? = null,
  public val url: String? = null,
) {
  public class Builder {
    public var key: String? = null

    public var name: String? = null

    public var nodeId: String? = null

    public var spdxId: String? = null

    public var url: String? = null

    public fun build(): InlineMinimalRepositoryLicenseX5778c2e1 = InlineMinimalRepositoryLicenseX5778c2e1(
      key = key,
      name = name,
      nodeId = nodeId,
      spdxId = spdxId,
      url = url,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMinimalRepositoryLicenseX5778c2e1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMinimalRepositoryLicenseX5778c2e1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMinimalRepositoryLicenseX5778c2e1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMinimalRepositoryLicenseX5778c2e1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMinimalRepositoryLicenseX5778c2e1 must be a JSON object")
      return InlineMinimalRepositoryLicenseX5778c2e1(
        key = rawObject["key"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        nodeId = rawObject["node_id"]?.let { json.decodeFromJsonElement<String>(it) },
        spdxId = rawObject["spdx_id"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMinimalRepositoryLicenseX5778c2e1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMinimalRepositoryLicenseX5778c2e1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.key?.let { put("key", it) }
        value.name?.let { put("name", it) }
        value.nodeId?.let { put("node_id", it) }
        value.spdxId?.let { put("spdx_id", it) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMinimalRepositoryLicenseX5778c2e1(block: InlineMinimalRepositoryLicenseX5778c2e1.Builder.() -> Unit): InlineMinimalRepositoryLicenseX5778c2e1 = InlineMinimalRepositoryLicenseX5778c2e1.build(block)
