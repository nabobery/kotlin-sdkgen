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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/package-version/properties/metadata.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/package-version/properties/metadata
 */
@Serializable(with = InlinePackageVersionMetadataXa969c2d8.Serializer::class)
public class InlinePackageVersionMetadataXa969c2d8(
  public val packageType: InlinePackageVersionMetadataPackageTypeXad4c7af0,
  public val container: InlinePackageVersionMetadataContainerX21d8cc27? = null,
  public val docker: InlinePackageVersionMetadataDockerXacbe231b? = null,
) {
  public class Builder {
    private var packageTypeValue: InlinePackageVersionMetadataPackageTypeXad4c7af0? = null

    public var packageType: InlinePackageVersionMetadataPackageTypeXad4c7af0
      get() = requireNotNull(packageTypeValue) { "packageType is required" }
      set(`value`) {
        packageTypeValue = value
      }

    public var container: InlinePackageVersionMetadataContainerX21d8cc27? = null

    public var docker: InlinePackageVersionMetadataDockerXacbe231b? = null

    public fun build(): InlinePackageVersionMetadataXa969c2d8 {
      check(packageTypeValue != null) { "packageType is required" }
      return InlinePackageVersionMetadataXa969c2d8(
        packageType = packageType,
        container = container,
        docker = docker,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePackageVersionMetadataXa969c2d8 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlinePackageVersionMetadataXa969c2d8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePackageVersionMetadataXa969c2d8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePackageVersionMetadataXa969c2d8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlinePackageVersionMetadataXa969c2d8 must be a JSON object")
      val packageType = json.decodeRequired<InlinePackageVersionMetadataPackageTypeXad4c7af0>(rawObject, "package_type")
      return InlinePackageVersionMetadataXa969c2d8(
        packageType = packageType,
        container = rawObject["container"]?.let { json.decodeFromJsonElement<InlinePackageVersionMetadataContainerX21d8cc27>(it) },
        docker = rawObject["docker"]?.let { json.decodeFromJsonElement<InlinePackageVersionMetadataDockerXacbe231b>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePackageVersionMetadataXa969c2d8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePackageVersionMetadataXa969c2d8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("package_type", json.encodeToJsonElement(value.packageType))
        value.container?.let { put("container", json.encodeToJsonElement(it)) }
        value.docker?.let { put("docker", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePackageVersionMetadataXa969c2d8(block: InlinePackageVersionMetadataXa969c2d8.Builder.() -> Unit): InlinePackageVersionMetadataXa969c2d8 = InlinePackageVersionMetadataXa969c2d8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlinePackageVersionMetadataXa969c2d8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
