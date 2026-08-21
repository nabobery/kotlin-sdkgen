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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/dependency-graph-spdx-sbom/properties/sbom/properties/packages/items
 * /properties/externalRefs/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/dependency-graph-spdx-sbom/properties/sbom/properties/packages/items
 * /properties/externalRefs/items
 */
@Serializable(with = InlineDependencyGraphSpdxSbomSbomPackagesItemExternalRefsItemX8ad0074e.Serializer::class)
public class InlineDependencyGraphSpdxSbomSbomPackagesItemExternalRefsItemX8ad0074e(
  /**
   * The category of reference to an external resource this reference refers to.
   */
  public val referenceCategory: String,
  /**
   * A locator for the particular external resource this reference refers to.
   */
  public val referenceLocator: String,
  /**
   * The category of reference to an external resource this reference refers to.
   */
  public val referenceType: String,
) {
  public class Builder {
    private var referenceCategoryValue: String? = null

    public var referenceCategory: String
      get() = requireNotNull(referenceCategoryValue) { "referenceCategory is required" }
      set(`value`) {
        referenceCategoryValue = value
      }

    private var referenceLocatorValue: String? = null

    public var referenceLocator: String
      get() = requireNotNull(referenceLocatorValue) { "referenceLocator is required" }
      set(`value`) {
        referenceLocatorValue = value
      }

    private var referenceTypeValue: String? = null

    public var referenceType: String
      get() = requireNotNull(referenceTypeValue) { "referenceType is required" }
      set(`value`) {
        referenceTypeValue = value
      }

    public fun build(): InlineDependencyGraphSpdxSbomSbomPackagesItemExternalRefsItemX8ad0074e {
      check(referenceCategoryValue != null) { "referenceCategory is required" }
      check(referenceLocatorValue != null) { "referenceLocator is required" }
      check(referenceTypeValue != null) { "referenceType is required" }
      return InlineDependencyGraphSpdxSbomSbomPackagesItemExternalRefsItemX8ad0074e(
        referenceCategory = referenceCategory,
        referenceLocator = referenceLocator,
        referenceType = referenceType,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineDependencyGraphSpdxSbomSbomPackagesItemExternalRefsItemX8ad0074e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineDependencyGraphSpdxSbomSbomPackagesItemExternalRefsItemX8ad0074e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineDependencyGraphSpdxSbomSbomPackagesItemExternalRefsItemX8ad0074e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineDependencyGraphSpdxSbomSbomPackagesItemExternalRefsItemX8ad0074e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineDependencyGraphSpdxSbomSbomPackagesItemExternalRefsItemX8ad0074e must be a JSON object")
      val referenceCategory = json.decodeRequired<String>(rawObject, "referenceCategory")
      val referenceLocator = json.decodeRequired<String>(rawObject, "referenceLocator")
      val referenceType = json.decodeRequired<String>(rawObject, "referenceType")
      return InlineDependencyGraphSpdxSbomSbomPackagesItemExternalRefsItemX8ad0074e(
        referenceCategory = referenceCategory,
        referenceLocator = referenceLocator,
        referenceType = referenceType,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineDependencyGraphSpdxSbomSbomPackagesItemExternalRefsItemX8ad0074e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineDependencyGraphSpdxSbomSbomPackagesItemExternalRefsItemX8ad0074e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("referenceCategory", value.referenceCategory)
        put("referenceLocator", value.referenceLocator)
        put("referenceType", value.referenceType)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineDependencyGraphSpdxSbomSbomPackagesItemExternalRefsItemX8ad0074e(block: InlineDependencyGraphSpdxSbomSbomPackagesItemExternalRefsItemX8ad0074e.Builder.() -> Unit): InlineDependencyGraphSpdxSbomSbomPackagesItemExternalRefsItemX8ad0074e = InlineDependencyGraphSpdxSbomSbomPackagesItemExternalRefsItemX8ad0074e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineDependencyGraphSpdxSbomSbomPackagesItemExternalRefsItemX8ad0074e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
