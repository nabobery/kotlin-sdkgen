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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/dependency-graph-spdx-sbom/properties/sbom/properties/relationships/
 * items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/dependency-graph-spdx-sbom/properties/sbom/properties/relationships/
 * items
 */
@Serializable(with = InlineDependencyGraphSpdxSbomSbomRelationshipsItemX86934e54.Serializer::class)
public class InlineDependencyGraphSpdxSbomSbomRelationshipsItemX86934e54(
  /**
   * The SPDX identifier of the package that is the target of the relationship.
   */
  public val relatedSpdxElement: String? = null,
  /**
   * The type of relationship between the two SPDX elements.
   */
  public val relationshipType: String? = null,
  /**
   * The SPDX identifier of the package that is the source of the relationship.
   */
  public val spdxElementId: String? = null,
) {
  public class Builder {
    /**
     * The SPDX identifier of the package that is the target of the relationship.
     */
    public var relatedSpdxElement: String? = null

    /**
     * The type of relationship between the two SPDX elements.
     */
    public var relationshipType: String? = null

    /**
     * The SPDX identifier of the package that is the source of the relationship.
     */
    public var spdxElementId: String? = null

    public fun build(): InlineDependencyGraphSpdxSbomSbomRelationshipsItemX86934e54 = InlineDependencyGraphSpdxSbomSbomRelationshipsItemX86934e54(
      relatedSpdxElement = relatedSpdxElement,
      relationshipType = relationshipType,
      spdxElementId = spdxElementId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineDependencyGraphSpdxSbomSbomRelationshipsItemX86934e54 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineDependencyGraphSpdxSbomSbomRelationshipsItemX86934e54> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineDependencyGraphSpdxSbomSbomRelationshipsItemX86934e54 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineDependencyGraphSpdxSbomSbomRelationshipsItemX86934e54")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineDependencyGraphSpdxSbomSbomRelationshipsItemX86934e54 must be a JSON object")
      return InlineDependencyGraphSpdxSbomSbomRelationshipsItemX86934e54(
        relatedSpdxElement = rawObject["relatedSpdxElement"]?.let { json.decodeFromJsonElement<String>(it) },
        relationshipType = rawObject["relationshipType"]?.let { json.decodeFromJsonElement<String>(it) },
        spdxElementId = rawObject["spdxElementId"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineDependencyGraphSpdxSbomSbomRelationshipsItemX86934e54) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineDependencyGraphSpdxSbomSbomRelationshipsItemX86934e54")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.relatedSpdxElement?.let { put("relatedSpdxElement", it) }
        value.relationshipType?.let { put("relationshipType", it) }
        value.spdxElementId?.let { put("spdxElementId", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineDependencyGraphSpdxSbomSbomRelationshipsItemX86934e54(block: InlineDependencyGraphSpdxSbomSbomRelationshipsItemX86934e54.Builder.() -> Unit): InlineDependencyGraphSpdxSbomSbomRelationshipsItemX86934e54 = InlineDependencyGraphSpdxSbomSbomRelationshipsItemX86934e54.build(block)
