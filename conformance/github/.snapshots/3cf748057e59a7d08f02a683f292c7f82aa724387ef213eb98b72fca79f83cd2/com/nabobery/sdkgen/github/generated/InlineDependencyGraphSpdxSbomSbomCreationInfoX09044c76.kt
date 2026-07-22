package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.yaml#/components/schemas/dependency-graph-spdx-sbom/properties/sbom/properties/creationInfo.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/dependency-graph-spdx-sbom/properties/sbom/properties/creationInfo
 */
@Serializable(with = InlineDependencyGraphSpdxSbomSbomCreationInfoX09044c76.Serializer::class)
public class InlineDependencyGraphSpdxSbomSbomCreationInfoX09044c76(
  /**
   * The date and time the SPDX document was created.
   */
  public val created: String,
  creators: List<String>,
) {
  /**
   * The tools that were used to generate the SPDX document.
   */
  public val creators: List<String> = creators.toList()

  public class Builder {
    private var createdValue: String? = null

    public var created: String
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var creatorsValue: List<String>? = null

    public var creators: List<String>
      get() = requireNotNull(creatorsValue) { "creators is required" }
      set(`value`) {
        creatorsValue = value
      }

    public fun build(): InlineDependencyGraphSpdxSbomSbomCreationInfoX09044c76 {
      check(createdValue != null) { "created is required" }
      check(creatorsValue != null) { "creators is required" }
      return InlineDependencyGraphSpdxSbomSbomCreationInfoX09044c76(
        created = created,
        creators = creators,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineDependencyGraphSpdxSbomSbomCreationInfoX09044c76 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineDependencyGraphSpdxSbomSbomCreationInfoX09044c76> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineDependencyGraphSpdxSbomSbomCreationInfoX09044c76 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineDependencyGraphSpdxSbomSbomCreationInfoX09044c76")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineDependencyGraphSpdxSbomSbomCreationInfoX09044c76 must be a JSON object")
      val created = json.decodeRequired<String>(rawObject, "created")
      val creators = json.decodeRequired<List<String>>(rawObject, "creators")
      return InlineDependencyGraphSpdxSbomSbomCreationInfoX09044c76(
        created = created,
        creators = creators,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineDependencyGraphSpdxSbomSbomCreationInfoX09044c76) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineDependencyGraphSpdxSbomSbomCreationInfoX09044c76")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created", value.created)
        put("creators", json.encodeToJsonElement(value.creators))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineDependencyGraphSpdxSbomSbomCreationInfoX09044c76(block: InlineDependencyGraphSpdxSbomSbomCreationInfoX09044c76.Builder.() -> Unit): InlineDependencyGraphSpdxSbomSbomCreationInfoX09044c76 = InlineDependencyGraphSpdxSbomSbomCreationInfoX09044c76.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineDependencyGraphSpdxSbomSbomCreationInfoX09044c76 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
